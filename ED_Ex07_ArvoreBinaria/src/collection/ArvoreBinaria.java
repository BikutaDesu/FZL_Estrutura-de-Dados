package collection;

public class ArvoreBinaria {

	private No raiz;

	public ArvoreBinaria() {
		raiz = null;
	}

	public void inserir(No noRaiz, int x) {
		if(noRaiz == null) {
			raiz = new No(x, null);
		}else if (noRaiz.getEsq() == null) {
			No novoNo = new No(x, noRaiz);
			noRaiz.setEsq(novoNo);
		}else if (noRaiz.getDir() == null) {
			No novoNo = new No(x, noRaiz);
			noRaiz.setDir(novoNo);
		}else {
			System.out.println("Não há nós vazios!!");
		}
	}

	public String printarArvore(No raiz) {
		String retorno = "(";
		if(raiz != null) {
			retorno += " " + raiz.getElemento() + " ";
			retorno += printarArvore(raiz.getEsq());
			retorno += printarArvore(raiz.getDir());
		}
		retorno += ") ";
		return retorno;
	}
	
	// Percursos
	
	public void preOrder(No p) {
		if (p != null) {
			System.out.println(p.getElemento() + " ");
			preOrder(p.getEsq());
			preOrder(p.getDir());
		}
	}
	
	public void inOrder(No p) {
		if (p != null) {
			inOrder(p.getEsq());
			System.out.println(p.getElemento() + " ");
			inOrder(p.getDir());
		}
	}
	
	public void postOrder(No p) {
		if (p != null) {
			postOrder(p.getEsq());
			postOrder(p.getDir());
			System.out.println(p.getElemento() + " ");
		}
	}
	
}
