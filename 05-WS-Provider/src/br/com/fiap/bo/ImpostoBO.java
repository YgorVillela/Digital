package br.com.fiap.bo;

public class ImpostoBO {

	public double calcularIRPF(double renda) {
		// 22900 isento
		// 33900 7,5%
		// 45000 15%
		// acima 27,5%

		double imposto = 0;
		if (renda >= 22900 && renda <= 33900) {
			imposto = renda * 0.075;
		} else if (renda > 33900 && renda <= 45000) {
			imposto = renda * 0.15;
		} else if (renda > 45000) {
			imposto = renda * 0.27;
		}

		return imposto;
	}

	public double calcularIPVA(double valor, boolean utilitario) {
		if (utilitario) {
			return valor * 0.02;
		} else {

			return valor * 0.04;
		}
	}
}
