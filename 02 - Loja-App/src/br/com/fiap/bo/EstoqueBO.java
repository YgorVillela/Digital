package br.com.fiap.bo;

import br.com.fiap.to.EstoqueTO;

public class EstoqueBO {
	EstoqueTO to = new EstoqueTO();

	public EstoqueTO consultarProduto(int cod) {
		
		switch (cod) {
		case 401:
			to = new EstoqueTO(401, 10, 5, "Camiseta Branca");
			break;
		case 402:
			to = new EstoqueTO(402, 11, 6, "Camiseta azul");
			break;
		case 403:
			to = new EstoqueTO(403, 12, 7, "Casmieat rosa");
			break;
		default:
			System.err.println("C�digo inv�lido!");
			System.exit(0);
		}

		return to;

	}

}
