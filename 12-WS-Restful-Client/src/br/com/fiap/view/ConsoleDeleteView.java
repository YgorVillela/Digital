package br.com.fiap.view;

import java.util.Scanner;

import br.com.fiap.repository.FilmeRepository;

public class ConsoleDeleteView {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int codigo = 0;
		
		System.out.println("Entre com o código do filme que deseja remover: ");
		codigo = teclado.nextInt();
		
		FilmeRepository rep = new FilmeRepository();
		try {
			rep.remover(codigo);
			System.out.println("Removido!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		teclado.close();

	}

}
