package br.com.fiap.teste;

import org.apache.log4j.Logger;

import br.com.fiap.singleton.ConfiguracaoSingleton;

public class Teste {

	private static Logger log = Logger.getLogger(Teste.class);

	public static void main(String[] args) {
		// recuperar a configuração de idioma

		log.info("Iniciando a aplicação");
		log.warn("Recuperando a configuração do sistema");

		String idioma = ConfiguracaoSingleton.getInstance().getProperty("idioma");
		log.info(idioma);
	}

}
