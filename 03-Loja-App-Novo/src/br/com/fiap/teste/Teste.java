package br.com.fiap.teste;


import java.util.Scanner;

import org.apache.log4j.Logger;

import br.com.fiap.bo.EstoqueBO;
import br.com.fiap.singleton.Singleton;

public class Teste {

	private static Logger log = Logger.getLogger(Teste.class);
	
	public static void main(String[] args) {
		log.warn("Inicio da aplicação");
		
		EstoqueBO bo = new EstoqueBO();
		int cod = 0;
		Scanner teclado = new Scanner(System.in);

		// Recuperar a configuração
		String filial = Singleton.getInstance().getProperty("filial");

		log.warn("Bem-vindo a " + filial + "\n");
		do {
			System.out.println("digite o código do produto: ");
			cod = teclado.nextInt();
			log.debug(bo.consultarProduto(cod));

		} while (cod != 404);
		teclado.close();
		log.warn(" Fim da aplicação");
	}
}
