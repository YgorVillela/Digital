package br.com.fiap.revisao.beans;

import java.util.Calendar;

public class Funcionario extends Pessoa {

	// constante
	// static -> arivuto/método da classe(não objeto)
	public static final String PREMIACAO_TOTAL = "10%"; // duas palavras em constante deve ser "separada" com " _ "

	private float salario;
	private Calendar dataAdmissao;

	public Funcionario(String nome) {
		super(nome);
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	// sobrescrever o método
	@Override
	public boolean validarRm() {
		String rmStr = String.valueOf(rm);
		return (rmStr.length() == 7) ? true : false;
	}

	public Calendar getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(Calendar dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
}
