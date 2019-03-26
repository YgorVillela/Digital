package br.com.fiap.bo;



import org.apache.log4j.Logger;

import br.com.fiap.to.EstoqueTO;

public class EstoqueBO {
	EstoqueTO to = new EstoqueTO();
	
	private static Logger log = Logger.getLogger(EstoqueBO.class);
	
	public EstoqueTO consultarProduto(int cod) {
		
		log.debug("Pesquisando por um produto" + cod);
		switch (cod) {
		case 401:
			to = new EstoqueTO(401, 10, 5, "Camiseta Branca");
			break;
		case 402:
			to = new EstoqueTO(402, 11, 6, "Camiseta azul");
			break;
		case 403:
			to = new EstoqueTO(403, 12, 7, "Casmiseta rosa");
			break;
		default:
			log.error("Código inválido!");
			System.exit(0);
		}

		return to;

	}

}
