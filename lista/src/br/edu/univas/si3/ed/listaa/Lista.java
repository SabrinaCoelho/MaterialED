package br.edu.univas.si3.ed.listaa;

import br.edu.univas.si3.ed.lista.dados.Entidade;
import br.edu.univas.si3.ed.lista.no.No;

public class Lista {
	private No inicio;
	private No ultimo;
	
	public void inserir(Entidade entidade) {
		No novoNo = new No();
		novoNo.entidade = entidade;
		if(estaVazia()) {
			this.inicio = novoNo;
			this.inicio.proximo = null;
			this.ultimo = this.inicio;
		}else {
			this.ultimo.proximo = novoNo;
			this.ultimo = novoNo;
			this.ultimo.proximo = null;
		}
	}
	public void imprimir() {
		System.out.println("----------------");
		No noDaVez = this.inicio;
		while(noDaVez != null) {
			System.out.println(noDaVez.entidade.nome);
			noDaVez = noDaVez.proximo;
		}
		System.out.println("----------------");
	}
	public Entidade buscarPorNome(String nome) {
		No noDaVez = this.inicio;
		while(noDaVez != null) {
			if(noDaVez.entidade.nome.equalsIgnoreCase(nome)) {
				//System.out.println("Encontrado");
				return noDaVez.entidade;
			}
			noDaVez = noDaVez.proximo;
		}
		return null;
	}
	public Entidade buscarPorPosicao(int pos) {
		No noDaVez = this.inicio;
		int posNoDaVez = 0;
		while(noDaVez != null) {
			if(posNoDaVez == pos) {
				return noDaVez.entidade;
			}
			posNoDaVez++;
			noDaVez = noDaVez.proximo;
		}
		return null;
	}
	public Entidade remover(String nomeProcurado) {
		if(estaVazia()) {
			return null;
		}
		//caminhar na lista. Para isso comecamos do inicio
		No noDaVez = this.inicio;
		No noAnterior = null;
		
		while(noDaVez != null) {
			//compara cada o nome da entidade de cada no ate encontrar o nome procurado
			if(noDaVez.entidade.nome.equalsIgnoreCase(nomeProcurado)) {
				//quando encontrado, encerra a caminhada na lista. Temos o anterior o atual que contem o procurado
				break;
			}//se nao e tal no, navegamos para o proximo
			noAnterior = noDaVez;
			noDaVez = noDaVez.proximo;
		}
		if(noDaVez == null){//chegou ao fim da lista -> se noDaVez = null -> nao encontrado. se noDaVez != null -> encontrado CATTO'S JUMP
			return null;
		}
		
		//*******diferentes procedimentos de remocao********
		
		//procurado eh o incial
		if(noAnterior == null) {//ou seja, eh o PRIMEIRO noh
			if(noDaVez.proximo == null) {//so tem 1 elemento. IMP: 1° analise eh em ambito de pesquisa na lista ("noDaVez")
				//2° analise eh em nivel da lista mesmo pq precisamos "zera-la", deixa-la vazia
				this.inicio = null;
				this.ultimo = null;
			}else if(noDaVez.proximo != null && noDaVez.proximo.proximo == null){//soh ha 2 elementos e o encontrado eh o primeiro
				//2° analise eh em nivel da lista. Atualizamos o ultimo para ser inicio e fim
				this.inicio = noDaVez.proximo;
				this.ultimo = noDaVez.proximo;
			}else {
				//atualiza o inicio
				this.inicio = noDaVez.proximo;
			}
		}else if(noAnterior != null){//noh do MEIO
			//removemos e "emendamos" o anterior com o proximo do encontrado;
			noAnterior.proximo = noDaVez.proximo;
		}else if(noDaVez.proximo == null){//eh o ULTIMO no
			//atualiza o ultimo da lista
			this.ultimo = noAnterior;
			this.ultimo.proximo = null;
		}
		return noDaVez.entidade;
	}
	private boolean estaVazia() {
		return this.inicio == null;
	}
}
