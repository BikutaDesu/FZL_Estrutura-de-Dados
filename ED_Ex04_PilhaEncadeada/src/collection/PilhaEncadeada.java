package collection;

import model.Livro;

public class PilhaEncadeada {

	private int topo;
	private Livro livroTopo;

	public PilhaEncadeada() {
		this.topo = -1;
	}

	public boolean estaVazia() {
		return (topo == -1);
	}

	public void push(Livro livro) {
		if (estaVazia()) {
			topo++;
			livro.setAnterior((Livro) null);
			livroTopo = livro;
		} else {
			topo++;
			livro.setAnterior(livroTopo);
			livroTopo = livro;
		}
	}

	public Livro pop() {
		Livro livro = (Livro) null;
		if(!estaVazia()) {
			livro = livroTopo;
			livroTopo = livro.getAnterior();
		}else{
			System.out.println("Lista vazia!!");
		}
		return livro;
	}
	
	public Livro top() {
		Livro livro = (Livro) null;
		if(!estaVazia()) {
			livro = livroTopo;
		}else{
			System.out.println("Lista vazia!!");
		}
		return livro;
	}
	
	public int getTamanho() {
		return this.topo+1;
	}
	
	
}
