package br.com.fiap.to;

public class EstoqueTO {

	private int cod;
	private double preco;
	private int qtd;
	private String descricao;

	public EstoqueTO() {
		super();
	}

	public EstoqueTO(int cod, double preco, int qtd, String descricao) {
		super();
		this.cod = cod;
		this.preco = preco;
		this.qtd = qtd;
		this.descricao = descricao;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "c�digo: " + getCod() + "\n" + "pre�o: " + getPreco() + "\n" + "quantidade: " + getQtd() + "\n"
				+ "descri��o: " + getDescricao();
	}
}
