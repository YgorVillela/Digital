package br.com.fiap.view;

import java.util.Scanner;

import br.com.fiap.repository.FilmeRepository;
import br.com.fiap.to.Filme;

public class ConsoleBuscaView {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int codigo = 0;
		
		FilmeRepository rep = new FilmeRepository();
		Filme filme = new Filme();
		
		System.out.println("Digite o código do filme: ");
		codigo = teclado.nextInt();
		
		try {
			
			rep.buscar(codigo);
			System.out.println("Filme: " + filme.getNome() + ", Duração: " + filme.getDuracao() + ", Cartaz: " + filme.isCartaz());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		teclado.close();

	}

}
