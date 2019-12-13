package collection;

import java.util.LinkedList;
import java.util.List;

public class HashV2 {
	private boolean ocupado;
	private List<String> listaNomes = new LinkedList<>();
	
	public HashV2() {
		setOcupado(false);
	}

	public boolean isOcupado() {
		return ocupado;
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}
	
	public String getNomes() {
		return listaNomes.toString();
	}

	public void setNome(String nome) {
		setOcupado(true);
		this.listaNomes.add(nome);
	}

	public List<String> getListaNomes() {
		return listaNomes;
	}
	
	
	
	
	
	
}
