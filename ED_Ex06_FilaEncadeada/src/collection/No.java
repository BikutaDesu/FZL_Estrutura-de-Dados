package collection;

import model.Pessoa;

public class No {
	private Pessoa pessoa;
	private No anterior;

	public No(Pessoa pessoa) {
		this.pessoa = pessoa;
		this.anterior = (No) null;
	}

	public No(Pessoa pessoa, No anterior) {
		super();
		this.pessoa = pessoa;
		this.anterior = anterior;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public No getAnterior() {
		return anterior;
	}

	public void setAnterior(No anterior) {
		this.anterior = anterior;
	}

}
