package br.edu.univas.si3.ed.fila.Fila;

import br.edu.univas.si3.ed.fila.dados.Pessoa;
import br.edu.univas.si3.ed.no.No;

public class Fila {
	/*private Pessoa inicio = null;
	private Pessoa ultimo = null;
	private int tamanho = 0;
	
	public void inserir(Pessoa novo) {
		if(estaVazia()) {//o segredo esta na sequencia
			this.inicio = novo;
			this.inicio.proximo = null;
			this.ultimo = this.inicio;
		}else {
			this.ultimo.proximo = novo;
			this.ultimo = novo;
			this.ultimo.proximo = null;
		}
		this.tamanho++;
	}
	public Pessoa remover() {
		Pessoa removido = null;
		//necessario retornar o removido
		if(estaVazia()) {
			System.out.println("Nao ha o que remover.");//???
			ultimo = null;//pq ultimo ainda fica apontando para algum ob
		}else {
			removido = this.inicio;
			this.inicio = this.inicio.proximo;
			this.tamanho--;
		}
		return removido;
	}
	public void imprimir() {
		Pessoa pessoaDaVez = this.inicio;
		if(!estaVazia()) {
			while(pessoaDaVez != null) {
				System.out.println("--"+pessoaDaVez.nome);
				pessoaDaVez = pessoaDaVez.proximo;
			}
		}
	}
	public boolean estaVazia() {
		if(inicio == null) {
			return true;//esta
		}
		return false;//nao esta
	}
	public int getTamanho() {
		return this.tamanho;
	}*/
	
	private No inicio = null;
	private No ultimo = null;
	private int tamanho = 0;
	
	public void inserir(Pessoa novo) {
		No novoNo = new No();
		novoNo.pessoa = novo;
		if(estaVazia()) {//o segredo esta na sequencia
			this.inicio = novoNo;
			this.inicio.proximo = null;
			this.ultimo = this.inicio;
		}else {
			this.ultimo.proximo = novoNo;
			this.ultimo = novoNo;
			this.ultimo.proximo = null;
		}
		this.tamanho++;
	}
	public No remover() {
		No removido = null;
		//necessario retornar o removido
		if(estaVazia()) {
			System.out.println("Nao ha o que remover.");//???
			ultimo = null;//pq ultimo ainda fica apontando para um objeto
		}else {
			removido = this.inicio;
			this.inicio = this.inicio.proximo;
			this.tamanho--;
		}
		return removido;
	}
	public void imprimir() {
		No noDaVez = this.inicio;
		if(!estaVazia()) {
			while(noDaVez != null) {
				System.out.println("--"+noDaVez.pessoa.nome);
				noDaVez = noDaVez.proximo;
			}
		}
	}
	public boolean estaVazia() {
		if(inicio == null) {
			return true;//esta
		}
		return false;//nao esta
	}
	public int getTamanho() {
		return this.tamanho;
	}
	public int comprimento() {
		No noDaVez = this.inicio;
		int comprimento = 0;
		while(noDaVez != null) {
			comprimento++;
			//System.out.println(comprimento);
			
			noDaVez = noDaVez.proximo;
		}
		return comprimento;
	}
}
