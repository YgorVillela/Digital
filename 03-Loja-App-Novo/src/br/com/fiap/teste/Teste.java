package br.com.fiap.teste;

import java.util.Scanner;

import br.com.fiap.bo.EstoqueBO;
import br.com.fiap.singleton.Singleton;

public class Teste {

	public static void main(String[] args) {

		EstoqueBO bo = new EstoqueBO();
		int cod = 0;
		Scanner teclado = new Scanner(System.in);

		// Recuperar a configuração
		String filial = Singleton.getInstance().getProperty("filial");

		System.out.println("Bem-vindo a " + filial + "\n");
		do {
			System.out.println("digite o código do produto: ");
			cod = teclado.nextInt();
			System.out.println(bo.consultarProduto(cod));

		} while (cod != 404);
		teclado.close();
	}
}
