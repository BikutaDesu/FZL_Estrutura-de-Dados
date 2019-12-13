package collection;

public class No {

	private No pai;
	private No esq;
	private No dir;
	private int elemento;

	public No(int elemento) {
		setElemento(elemento);
		setPai(null);
		setEsq(null);
		setDir(null);
	}
	
	public No(int elemento, No pai) {
		setElemento(elemento);
		setPai(pai);
		setEsq(null);
		setDir(null);
	}

	public No getPai() {
		return pai;
	}

	public void setPai(No pai) {
		this.pai = pai;
	}

	public No getEsq() {
		return esq;
	}

	public void setEsq(No esq) {
		this.esq = esq;
	}

	public No getDir() {
		return dir;
	}

	public void setDir(No dir) {
		this.dir = dir;
	}

	public int getElemento() {
		return elemento;
	}

	public void setElemento(int elemento) {
		this.elemento = elemento;
	}

}
