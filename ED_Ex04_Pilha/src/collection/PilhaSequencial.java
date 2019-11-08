package collection;

import model.Livro;

public class PilhaSequencial {

	private int topo;
	private Livro[] pilha = new Livro[30];

	public PilhaSequencial() {
		this.topo = -1;
	}

	public void push(Livro livro) {
		if (!listaEstaCheia()) {
			
		}
	}

	private int getTopo() {
		return this.topo;
	}

	private boolean listaEstaCheia() {
		return (this.topo == pilha.length - 1); 
	}

}
