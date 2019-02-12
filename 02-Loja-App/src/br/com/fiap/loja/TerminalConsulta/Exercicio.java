package br.com.fiap.loja.TerminalConsulta;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {

		int cod = 0;

		Scanner teclado = new Scanner(System.in);

		
		System.out.println("Bem-vindo a Loja 4000");
		System.out.println();
		
		
		Calendar data = new GregorianCalendar(2018, Calendar.FEBRUARY, 06);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm");
		
		System.out.println("Data de hoje: "+ sdf.format(data.getTime()));
		System.out.println();
		
		System.out.println("C�digo 401 - camiseta branca");
		System.out.println("C�digo 402 - Camiseta azul");
		System.out.println("c�digo 403 - Camiseta rosa");
		
		
		System.out.println("Entre com o c�digo da camiseta");
		cod =	teclado.nextInt();
		
		switch (cod) {
		case 401:
			System.out.println("C�digo 401 - Camiseta branca");
		break;
		case 402:
			System.out.println("C�digo 402 - Camiseta azul");
		break;
		case 403:
			System.out.println("C�digo 403 - Camiseta rosa");
		break;
		default:
			System.err.println("Produto n�o encontrado");
			break;
		}
		
		teclado.close();
	}

}
