package model;

public class Livro {
	private int numero;
	private String titulo;
	private String autor;
	private double preco;
	private Livro anterior;

	public Livro(int numero, String titulo, String autor, double preco, Livro anterior) {
		super();
		this.numero = numero;
		this.titulo = titulo;
		this.autor = autor;
		this.preco = preco;
		this.anterior = anterior;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Livro [numero=" + numero + ", titulo=" + titulo + ", autor=" + autor + ", preco=" + preco
				+  "]";
	}

	public Livro getAnterior() {
		return anterior;
	}

	public void setAnterior(Livro anterior) {
		this.anterior = anterior;
	}

}
