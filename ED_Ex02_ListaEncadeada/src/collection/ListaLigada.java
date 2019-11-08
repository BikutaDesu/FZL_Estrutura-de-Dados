package collection;

import model.Livro;

public class ListaLigada {
	private Livro ultimo;
	private int tamanho;

	public ListaLigada() {
		this.tamanho = 0;
		this.ultimo = (Livro) null;
	}

	public void adicionarNovo(int numero, String titulo, String autor, double preco) {
		Livro livro;
		if (listaEstaVazia()) {
			livro = new Livro(numero, titulo, autor, preco, (Livro) null);
			ultimo = livro;
		} else {
			livro = new Livro(numero, titulo, autor, preco, ultimo);
			ultimo = livro;
		}
		tamanho++;
	}

	public void adicionarNovo(int posicao, int numero, String titulo, String autor, double preco) {
		if (posicao <= this.tamanho && posicao > 0) {
			Livro livroAtual = ultimo;
			int posicaoAtual = 1;
			while (livroAtual != null) {
				if (posicao == 1) {
					Livro novoLivro = new Livro(numero, titulo, autor, preco, this.ultimo);
					this.ultimo = novoLivro;
					tamanho++;
					break;
				} else if (posicaoAtual == posicao - 1) {
					Livro novoLivro = new Livro(numero, titulo, autor, preco, livroAtual.getAnterior());
					livroAtual.setAnterior(novoLivro);
					tamanho++;
					break;
				}
				posicaoAtual++;
				livroAtual = livroAtual.getAnterior();
			}
		}
	}

	public void adicionarNovoPrimeiro(int numero, String titulo, String autor, double preco) {
		Livro livroAtual = ultimo;
		while (livroAtual != null) {
			if (livroAtual.getAnterior() == (Livro) null) {
				Livro novoLivro = new Livro(numero, titulo, autor, preco, (Livro) null);
				livroAtual.setAnterior(novoLivro);
				tamanho++;
				break;
			}
			livroAtual = livroAtual.getAnterior();
		}
	}

	public Livro getLivro(int posicao) {
		Livro livro = (Livro) null;
		if (posicao <= this.tamanho) {
			Livro livroAtual = ultimo;
			int posicaoAtual = 1;
			while (livroAtual != null) {
				if (posicaoAtual == posicao) {
					livro = livroAtual;
					break;
				}
				posicaoAtual++;
				livroAtual = livroAtual.getAnterior();
			}
			if (livro == (Livro) null) {
				System.out.println("Erro ao buscar o livro!");
			}
		}
		return livro;
	}

	public void remover(int posicao) {
		if (posicao <= this.tamanho) {
			Livro livroAtual = ultimo;
			int posicaoAtual = 1;
			while (livroAtual != null) {
				if (posicaoAtual == posicao - 1) {
					Livro livroAux = livroAtual.getAnterior();
					livroAtual.setAnterior(livroAux.getAnterior());
					livroAux.setAnterior(null);
				}
				posicaoAtual++;
				livroAtual = livroAtual.getAnterior();

			}
		}
	}

	public void remover() {
		if (!listaEstaVazia()) {
			Livro livro = ultimo.getAnterior();
			ultimo.setAnterior(null);
			ultimo = livro;
		}
	}

	public void buscar(Livro livro) {
		Livro livroAtual = ultimo;
		int posicaoAtual = 1;
		while (livroAtual != null) {
			if (livro == livroAtual) {
				System.out.printf("Livro encontrado na posição %d\n", posicaoAtual);
				return;
			}
			livroAtual = livroAtual.getAnterior();
			posicaoAtual++;
		}
		System.out.println("Livro não encontrado!");
	}

	public int getTamanho() {
		return this.tamanho;
	}

	public boolean listaEstaVazia() {
		return tamanho == 0;
	}

	public void exibirTodos() {
		Livro livroAtual = ultimo;
		while (livroAtual != null) {
			System.out.println(livroAtual.toString());
			livroAtual = livroAtual.getAnterior();
		}
		System.out.println();
	}
}
