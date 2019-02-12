package br.com.fiap.teste;

import org.apache.log4j.Logger;

import br.com.fiap.singleton.ConfiguracaoSingleton;

public class Teste {

	private static Logger log = Logger.getLogger(Teste.class);

	public static void main(String[] args) {
		// recuperar a configura��o de idioma

		log.info("Iniciando a aplica��o");
		log.warn("Recuperando a configura��o do sistema");

		String idioma = ConfiguracaoSingleton.getInstance().getProperty("idioma");
		log.info(idioma);
	}

}
