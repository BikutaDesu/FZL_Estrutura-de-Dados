package collection;

public class HashV1 {
	private boolean ocupado;
	private String nome;
	
	public HashV1() {
		setOcupado(false);
	}

	public boolean isOcupado() {
		return ocupado;
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		setOcupado(true);
		this.nome = nome;
	}
	
	
	
	
}
