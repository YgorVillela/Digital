package br.com.fiap.repository;

import java.util.List;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import br.com.fiap.to.Categoria;

public class CategoriaRepository {

	private Client client = Client.create();
	private static final String URL = "http://localhost:8080/11-WS-Restful/rest/categoria/";

	public void cadastrar(Categoria categoria) throws Exception {
		WebResource resource = client.resource(URL);

		ClientResponse resp = resource.type(MediaType.APPLICATION_JSON).post(ClientResponse.class, categoria);

		if (resp.getStatus() != 201) {
			throw new Exception();
		}
	}

	public void atualizar(Categoria categoria)throws Exception {
		WebResource resource = client.resource(URL).path(String.valueOf(categoria.getCodigo()));
		
		ClientResponse resp = resource.type(MediaType.APPLICATION_JSON).put(ClientResponse.class, categoria);
		
		if(resp.getStatus()!=201) {
			throw new Exception();
		}
	}

	public void remover() throws Exception{

	}

	public void buscar() throws Exception{

	}

	public List<Categoria> listar() throws Exception {

	}
}
