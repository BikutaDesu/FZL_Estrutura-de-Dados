package collection;

import model.Pessoa;

public class FilaSequencial {

	private Pessoa[] vetPessoa;
	private int quantidade;

	public FilaSequencial(int tamanho) {
		vetPessoa = new Pessoa[tamanho];
		quantidade = -1;
	}

	public void enfileirar(Pessoa pessoa) {
		if (!estaCheio()) {
			quantidade++;
			vetPessoa[quantidade] = pessoa;
		} else {
			System.out.println("A fila está cheia!");
		}
	}

	public Pessoa desenfileirar() {
		Pessoa pessoa = vetPessoa[0];
		for (int i = 1; i <= quantidade; i++) {
			vetPessoa[i - 1] = vetPessoa[i];
		}
		quantidade--;
		return pessoa;
	}
	
	public Pessoa obterPrimeiro() {
		return vetPessoa[0];
	}

	public int getQuantidade() {
		return quantidade;
	}

	public boolean estaCheio() {
		return (quantidade == vetPessoa.length - 1);
	}

	public boolean estaVazio() {
		return (quantidade == -1);
	}

	public void exibirFila() {
		System.out.println("Fila = [");
		for (int i = 0; i <= quantidade; i++) {
			System.out.println("   " + vetPessoa[i]);
		}
		System.out.println("]");
	}
	
	public Pessoa buscar(Integer id) {
		Pessoa pessoa = null;
		for (int i = 0; i <= quantidade; i++) {
			if (vetPessoa[i].getId().equals(id)) {
				pessoa = vetPessoa[i];
				break;
			}
		}
		return pessoa;
	}
	
	public Pessoa buscar(String email) {
		Pessoa pessoa = null;
		for (int i = 0; i <= quantidade; i++) {
			if (vetPessoa[i].getEmail().equals(email)) {
				pessoa = vetPessoa[i];
				break;
			}
		}
		return pessoa;
	}
}
