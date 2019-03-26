package br.com.fiap.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.InternalServerErrorException;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import br.com.fiap.dao.CategoriaDAO;
import br.com.fiap.dao.impl.CategoriaDAOImpl;
import br.com.fiap.entity.Categoria;
import br.com.fiap.exception.CodigoInexistenteException;
import br.com.fiap.exception.CommitException;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

@Path("/categoria")
public class CategoriaResource {

	private CategoriaDAO dao;

	public CategoriaResource() {
		dao = new CategoriaDAOImpl(EntityManagerFactorySingleton.getInstance().createEntityManager());
	}

	// Criar
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response cadastrar(Categoria categoria, @Context UriInfo uri) {
		try {
			dao.cadastrar(categoria);
			dao.commit();
		} catch (Exception e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
		UriBuilder url = uri.getAbsolutePathBuilder();

		url.path(Integer.toString(categoria.getCodigo()));

		return Response.created(url.build()).build();
	}

	// Read
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Categoria buscar(@PathParam("id") int codigo) {
		return dao.buscar(codigo);
	}

	// Read Geral
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Categoria> buscar() {
		return dao.listar();
	}
	//Atualizar
	@PUT
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response atualizar(Categoria categoria, @PathParam("id")int codigo) {
		try {
			categoria.setCodigo(codigo);
			dao.atualizar(categoria);
			dao.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Response.ok().build();
	}
	//Deletando
	@DELETE
	@Path("/{id}")
	public void remover(@PathParam("id")int codigo) {
		try {
			dao.remover(codigo);
			dao.commit();
		} catch (CommitException e) {
			e.printStackTrace();
		}catch(CodigoInexistenteException e) {
			e.printStackTrace();
			throw new InternalServerErrorException();
		}
	}
}
