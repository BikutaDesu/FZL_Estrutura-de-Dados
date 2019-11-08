package collection;

import java.util.NoSuchElementException;

import model.Pessoa;

public class FilaEncadeada {

	private int tamanho;
	private No primeiro;
	private No ultimo;

	public FilaEncadeada() {
		this.tamanho = -1;
		this.primeiro = (No) null;
		this.ultimo = (No) null;
	}

	public void adicionar(Pessoa pessoa) {
		if (!estaVazia()) {
			No novoNo = new No(pessoa);
			ultimo.setAnterior(novoNo);
			ultimo = novoNo;
		} else {
			No novoNo = new No(pessoa);
			primeiro = novoNo;
			ultimo = novoNo;
		}
		tamanho++;
	}

	public Pessoa remover() {
		Pessoa primeiroFila = (Pessoa) null;
		try {
			primeiroFila = primeiro.getPessoa();
			primeiro = primeiro.getAnterior();
			tamanho--;
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
		return primeiroFila;
	}

	public Pessoa cortar() {
		Pessoa primeiroFila = (Pessoa) null;
		if (!estaVazia()) {
			if (tamanho > 0) {
				primeiroFila = primeiro.getPessoa();
				primeiro = primeiro.getAnterior();
				tamanho--;
			}

		} else {
			System.out.println("Fila vazia!!");
		}
		return primeiroFila;
	}

	public Pessoa getPrimeiro() {
		return primeiro.getPessoa();
	}

	public boolean estaVazia() {
		return (tamanho == -1);
	}

	public int getTamanho() {
		return (tamanho + 1);
	}
}
