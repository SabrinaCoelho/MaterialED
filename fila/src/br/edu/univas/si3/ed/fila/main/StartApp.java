package br.edu.univas.si3.ed.fila.main;

import br.edu.univas.si3.ed.fila.Fila.Fila;
import br.edu.univas.si3.ed.fila.dados.Pessoa;
import br.edu.univas.si3.ed.no.No;

public class StartApp {
	public static void main(String[] args) {
		Fila fila = new Fila();
		Pessoa p1 = new Pessoa("João");
		Pessoa p2 = new Pessoa("Júlia");
		Pessoa p3 = new Pessoa("Jane");
		
		System.out.println(fila.comprimento());
		
		System.out.println("Tamanho da fila: " + fila.getTamanho());
		fila.imprimir();
		
		fila.inserir(p1);
		System.out.println("Tamanho da fila: " + fila.getTamanho());
		fila.imprimir();
		
		fila.inserir(p2);
		System.out.println("Tamanho da fila: " + fila.getTamanho());
		fila.imprimir();

		fila.inserir(p3);
		System.out.println("Tamanho da fila: " + fila.getTamanho());
		fila.imprimir();
		
		System.out.println(fila.comprimento());
		
		No atendido = fila.remover();
		System.out.println("Atendido 1: " + atendido.pessoa.nome);
		System.out.println("Tamanho da fila: " + fila.getTamanho());
		
		System.out.println("---------------");
		atendido = fila.remover();
		System.out.println("Atendido 2: " + atendido.pessoa.nome);
		System.out.println("Tamanho da fila: " + fila.getTamanho());
		
		System.out.println("---------------");
		atendido = fila.remover();
		System.out.println("Atendido 3: " + atendido.pessoa.nome);
		System.out.println("Tamanho da fila: " + fila.getTamanho());
		
		System.out.println("---------------");
		atendido = fila.remover();
		System.out.println("Atendido 4: " + atendido.pessoa.nome);
		System.out.println("Tamanho da fila: " + fila.getTamanho());
		
	}
}
