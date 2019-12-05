package model;

public class Aluno {
	private String nome;
	
	public Aluno(String nome) {
		setNome(nome);
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
}
