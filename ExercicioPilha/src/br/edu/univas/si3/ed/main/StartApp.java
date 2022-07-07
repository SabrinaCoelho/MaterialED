package br.edu.univas.si3.ed.main;

import br.edu.univas.si3.ed.expressao.Expressao;

public class StartApp {
	public static void main(String[]args) {
		Expressao exp = new Expressao();
		System.out.println(exp.validaExpressao("{a+b}+(c-d)"));
		System.out.println(exp.validaExpressao("a+b)"));
		System.out.println(exp.validaExpressao("())"));
	}
}
