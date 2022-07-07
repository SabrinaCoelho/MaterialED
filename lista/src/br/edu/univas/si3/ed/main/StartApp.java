package br.edu.univas.si3.ed.main;

import br.edu.univas.si3.ed.lista.dados.Entidade;
import br.edu.univas.si3.ed.listaa.Lista;

public class StartApp {
	public static void main(String[] args) {
		Lista lista = new Lista();
		
		Entidade e1 = new Entidade("Macarrao");
		lista.inserir(e1);
		Entidade e2 = new Entidade("Bolacha");
		lista.inserir(e2);
		Entidade e3 = new Entidade("Pao");
		lista.inserir(e3);
		Entidade e4 = new Entidade("Cafe");
		lista.inserir(e4);
		
		lista.imprimir();
		
		Entidade encontrado = lista.buscarPorNome("pao");
		System.out.println("Encontrado "+encontrado.nome);
		
		encontrado = lista.buscarPorPosicao(2);//pao
		System.out.println("Encontrado "+encontrado.nome);
		//****************
		Entidade removido = lista.remover("pao");//teste remocao do meio
		System.out.println("Removido "+removido.nome);
		
		lista.imprimir();
		//****************
		removido = lista.remover("macarrao");//teste remocao do inicio
		System.out.println("Removido "+removido.nome);
		lista.imprimir();
		//****************
		removido = lista.remover("cafe");//teste remocao do ultimo
		System.out.println("Removido "+removido.nome);
		lista.imprimir();
		//****************
		removido = lista.remover("bolacha");//teste remocao do ultimo
		System.out.println("Removido "+removido.nome);
		lista.imprimir();
		
	}
	
}
