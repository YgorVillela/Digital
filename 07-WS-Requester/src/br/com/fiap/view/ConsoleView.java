package br.com.fiap.view;

import java.util.Scanner;

import br.com.fiap.bo.ImpostoBOStub;
import br.com.fiap.bo.ImpostoBOStub.CalcularIRPF;
import br.com.fiap.bo.ImpostoBOStub.CalcularIRPFResponse;

public class ConsoleView {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		//criar o objeto que acessa o web service
		try {
			ImpostoBOStub stub = new ImpostoBOStub();
			
			//objeto que armazena os valores enviados para o servidor
			CalcularIRPF valores = new CalcularIRPF();
			
			System.out.println("Digite a renda: ");
			valores.setRenda(teclado.nextDouble()); //scanner vem dentro como parâmetro, assim o usuario seta os valores
			
			CalcularIRPFResponse resp =  stub.calcularIRPF(valores);
			
			System.out.println("Imposto é " + resp.get_return());
			
		} catch (Exception e) {
			System.err.println("Por favor, tente mais tarde");
			e.printStackTrace();
		}
		
		
		
		
		teclado.close();
	}

}
