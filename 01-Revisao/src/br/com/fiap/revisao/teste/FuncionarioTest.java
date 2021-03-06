package br.com.fiap.revisao.teste;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import br.com.fiap.revisao.beans.Funcionario;
import br.com.fiap.revisao.beans.Genero;

public class FuncionarioTest {

	public static void main(String[] args) {
		// Instanciar um funcion�rio
		Funcionario func = new Funcionario("AAAA");
		// Atribuir uma data de admiss�o
		// func.setDataAdmissao(Calendar.getInstance());
		Calendar data = Calendar.getInstance();
		Calendar data2 = new GregorianCalendar(2018, Calendar.JANUARY, 20);
		func.setDataAdmissao(data);

		// objeto para converter
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); // 'MM' que represente o m�s
																	// precisa ser ma�sculo, 'm' min�sculo conta como
																	// minuto

		// exibir a data

		System.out.println(sdf.format(data2.getTime()));
		
		//exibir o genero
		System.out.println(func.getGenero());
		
		//atribuir um valor para o genero
		func.setGenero(Genero.MASCULINO);
		System.out.println(func.getGenero());

	}

}
