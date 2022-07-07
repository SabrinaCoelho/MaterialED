package br.edu.univas.si3.ed.pilha.pilha;

import br.edu.univas.si3.ed.pilha.dados.Livro;
import br.edu.univas.si3.ed.pilha.no.No;

public class Pilha {
	private No topo = null;
	
	private int tamanho = 0;
	
	public void inserir(Livro novoLivro) {
		No novoNo = new No();
		novoNo.livro = novoLivro;
		
		if(estaVazia()) {//o segredo esta na sequencia
			this.topo = novoNo;
			this.topo.abaixo = null;
			//this.ultimo = this.inicio;
		}else {
			novoNo.abaixo = this.topo;
			this.topo = novoNo;
			/*No host = this.topo;
			this.topo = novoNo;
			this.topo.abaixo = host;*/
			
			//this.ultimo = novoNo;
			//this.ultimo.proximo = null;
		}
		this.tamanho++;
	}
	public No remover() {
		No removido = null;
		//necessario retornar o removido
		if(estaVazia()) {
			System.out.println("Nao ha o que remover.");//???
			this.topo = null;//pq ultimo ainda fica apontando para algum ob
		}else {
			removido = this.topo;
			this.topo = removido.abaixo;
			this.tamanho--;
		}
		return removido;
	}
	public void imprimir() {
		No noDaVez = this.topo;
		if(!estaVazia()) {
			while(noDaVez != null) {
				System.out.println("-"+noDaVez.livro.getNome());
				noDaVez = noDaVez.abaixo;
			}
		}
	}
	public boolean estaVazia() {
		if(this.topo == null) {
			return true;//esta
		}
		return false;//nao esta
	}
	public int getTamanho() {
		return this.tamanho;
	}
}
