package br.com.fiap.view;

import java.util.Scanner;

import br.com.fiap.repository.FilmeRepository;
import br.com.fiap.to.Filme;

public class ConsoleCadastroView {

	public static void main(String[] args) {
		
		String filme = "";
		int duracao = 0;
		boolean cartaz = false;
		
		Scanner teclado = new Scanner(System.in);
		
		
		
		
		System.out.println("Digite o filme: ");
		filme = teclado.next();
		System.out.println("Digite a duração: ");
		duracao = teclado.nextInt();
		System.out.println("Está em cartaz? ");
		cartaz = teclado.nextBoolean();
		
		Filme fil = new Filme(0,filme,duracao,cartaz);
		FilmeRepository rep = new FilmeRepository();
		try {
			rep.cadastrar(fil);
			System.out.println("Sucesso!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		teclado.close();

	}

}
