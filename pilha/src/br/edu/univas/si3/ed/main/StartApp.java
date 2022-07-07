package br.edu.univas.si3.ed.main;

import br.edu.univas.si3.ed.pilha.dados.Livro;
import br.edu.univas.si3.ed.pilha.no.No;
import br.edu.univas.si3.ed.pilha.pilha.Pilha;

public class StartApp {
	public static void main(String[] args) {
		Pilha pilha = new Pilha();
		Livro p1 = new Livro("Livro 1");
		Livro p2 = new Livro("Livro 2");
		Livro p3 = new Livro("Livro 3");
		
		//System.out.println(pilha.comprimento());
		
		System.out.println("Tamanho da fila: " + pilha.getTamanho());
		pilha.imprimir();
		
		pilha.inserir(p1);
		System.out.println("Tamanho da fila: " + pilha.getTamanho());
		pilha.imprimir();
		
		pilha.inserir(p2);
		System.out.println("Tamanho da fila: " + pilha.getTamanho());
		pilha.imprimir();

		pilha.inserir(p3);
		System.out.println("Tamanho da fila: " + pilha.getTamanho());
		pilha.imprimir();
		
		//System.out.println(pilha.comprimento());
		
		No atendido = pilha.remover();
		System.out.println("Pego 1: " + atendido.livro.getNome());
		System.out.println("Tamanho da fila: " + pilha.getTamanho());
		
		System.out.println("---------------");
		atendido = pilha.remover();
		System.out.println("Pego 2: " + atendido.livro.getNome());
		System.out.println("Tamanho da fila: " + pilha.getTamanho());
		
		System.out.println("---------------");
		atendido = pilha.remover();
		System.out.println("Pego 3: " + atendido.livro.getNome());
		System.out.println("Tamanho da fila: " + pilha.getTamanho());
		
		System.out.println("---------------");
		//atendido = pilha.remover();
		//System.out.println("Pego 4: " + atendido.livro.getNome());
		//System.out.println("Tamanho da fila: " + pilha.getTamanho());
		
	}
}
