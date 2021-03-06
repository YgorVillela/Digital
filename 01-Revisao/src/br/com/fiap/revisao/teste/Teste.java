package br.com.fiap.revisao.teste;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import br.com.fiap.revisao.beans.Funcionario;
import br.com.fiap.revisao.beans.Pessoa;

public class Teste {
	public static void main(String[] args) {
		//criar uma lista
		
		List<Pessoa> lista = new ArrayList<Pessoa>();
		
		//adicionar um elemento na lista
		
		lista.add(new Funcionario("Ygor"));
		lista.add(new Pessoa("Villela"));
		
		
		//percorrer a lista
		for(Pessoa p : lista) {
			System.out.println(p.getNome());
		}
		
		//criar um set e adicionar valores
		Set<String> set = new HashSet<>();
		set.add("AAAA");
		set.add("BBBBB");
		set.add("BBBBB");
		
		System.err.println("SET");
		for(String s : set) {
			System.out.println(s);
		}
	//criando um map
		
		Map<String, Pessoa> map = new HashMap<>();
		
		map.put("gerente", new Funcionario("hsahksahgsa"));
		map.put("cliente", new Pessoa("Ronaldo"));
		
		Pessoa p = map.get("gerente");
		System.out.println(p.getNome());
	}
}
