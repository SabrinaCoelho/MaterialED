package br.edu.univas.si3.ed.expressao;

import br.edu.univas.si3.ed.pilha.Pilha;

public class Expressao {
	//classe de analise da expressao
	
	static int i;
	public int validaExpressao(String exp) {
		i = 0;
		Pilha pilha = new Pilha();
		boolean key = false;
		//navego na string comparando cada caractere
		char correspondente = ' ';
		//System.out.println(i);
		for(; i < exp.length();i++) {//sabe ate onde ir
			char carac = exp.charAt(i);
			if(carac == correspondente){// == }
				pilha.remover();
				key = true;
				if(pilha.topo == null) {
					correspondente = ' ';
				}else {
					correspondente = pilha.topo.carac;
				}
				continue;
			}else if(carac != correspondente && carac == ']' ||  carac == ')') {// }
				return i;
			}else if(carac != correspondente && carac == '}' ||  carac == ')') {// ]
				return i;
			}else if(carac != correspondente && carac == ']' ||  carac == '}') {// )
				return i;
			}
			//identifica os abertos
			if(carac == '{' ) {
				correspondente = '}';
				pilha.inserir(carac);
			}else if(carac == '[' ) {
				correspondente = ']';
				pilha.inserir(carac);
			}else if(carac == '(') {
				correspondente = ')';
				pilha.inserir(carac);
			}
		}
		pilha.imprimir();
		//ao final, a pilha deve estar vazia (pq foi encontrado todos os correspondentes)
		if(pilha.getTamanho() != 0) {//pilha com elementos, ou seja, so abertos
			return pilha.getTamanho();//retorna o tamanho
		}else if(i > 0 && pilha.getTamanho() == 0 && !key) {// ha apenas de fechamento
			return i;//retorna a ultima posicao que deveria ter os correspondentes
		}
		return -1;
		
	}
}
