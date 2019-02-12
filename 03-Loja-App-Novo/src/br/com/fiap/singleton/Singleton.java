package br.com.fiap.singleton;

import java.util.Properties;

public class Singleton {
 
	private static Properties p;
	
	private Singleton() {
		
	}
	
	public static Properties getInstance() {
		if(p==null) {
			p = new Properties();
			try {
				p.load(Singleton.class.getResourceAsStream("/configuracao.properties"));
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return p;
	}
	
}
