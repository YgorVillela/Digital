package br.com.fiap.revisao.dao;

import br.com.fiap.revisao.beans.Pessoa;

public interface PessoaDAO {
	
	//assinaturas dos métodos
	void gravar(Pessoa pessoa);
	void atualizar(Pessoa pessoa);
	
	
}
