package br.com.fiap.bo;



import org.apache.axis2.AxisFault;
import org.apache.log4j.Logger;

import br.com.fiap.to.ProdutoTO;

public class EstoqueBO {
	ProdutoTO to = new ProdutoTO();
	
	private static Logger log = Logger.getLogger(EstoqueBO.class);
	
	public ProdutoTO consultarProduto(int cod)throws AxisFault {
		
		log.debug("Pesquisando por um produto" + cod);
		switch (cod) {
		case 401:
			to = new ProdutoTO(401, 10, 5, "Camiseta Branca");
			break;
		case 402:
			to = new ProdutoTO(402, 11, 6, "Camiseta azul");
			break;
		case 403:
			to = new ProdutoTO(403, 12, 7, "Casmiseta rosa");
			break;
		default:
			throw new AxisFault("Produto não encontrado!");
		}

		return to;

	}

}