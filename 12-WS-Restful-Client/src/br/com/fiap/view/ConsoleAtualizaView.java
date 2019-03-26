package br.com.fiap.view;

import java.util.Scanner;

import br.com.fiap.repository.FilmeRepository;
import br.com.fiap.to.Filme;

public class ConsoleAtualizaView {

	public static void main(String[] args) {
		
		int codigo = 0, duracao = 0;
		String nome = "";
		boolean cartaz = false;
		
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Entre com o código: ");
		codigo = teclado.nextInt();
		System.out.println("Nome: ");
		nome = teclado.next();
		System.out.println("Duração: ");
		duracao = teclado.nextInt();
		System.out.println("Cartaz? ");
		cartaz = teclado.nextBoolean();
		
		Filme filme = new Filme(codigo, nome,duracao,cartaz);
		FilmeRepository rep = new FilmeRepository();
		
		try {
			rep.atualizar(filme);
			System.out.println("Sucesso!!!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		teclado.close();

	}

}
