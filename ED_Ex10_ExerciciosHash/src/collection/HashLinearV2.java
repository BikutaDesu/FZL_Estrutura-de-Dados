package collection;

public class HashLinearV2 {

	private HashV2[] tabela;
	private int TAM_MAX;

	public HashLinearV2(int tamanho) {
		tabela = new HashV2[tamanho];
		TAM_MAX = tamanho;
		for (int i = 0; i < tabela.length; i++) {
			tabela[i] = new HashV2();
		}
	}

	public int hash(String nome) {
		char primeiraLetra = nome.toLowerCase().charAt(0);
		return Math.abs((int) primeiraLetra - (int) 'a');
	}

	public void inserir(String nome) {

		int pos = hash(nome);

		tabela[pos].setNome(nome);
		System.out.printf("-> Inserido HASH[%d]\n", pos);
	}

	public boolean isCheia() {
		int qtd = 0;
		for (int i = 0; i < TAM_MAX; i++) {
			if (tabela[i].isOcupado()) {
				qtd++;
			}
		}
		return (qtd == TAM_MAX) ? true : false;
	}

	public void imprimir() {
		for (int i = 0; i < TAM_MAX; i++) {
			if (tabela[i].isOcupado()) {
				System.out.printf("\nHASH[%d] = %s", i, tabela[i].getNomes());
			}
		}
	}

	public int buscar(String nome) {
		int pos = hash(nome);
		if (tabela[pos].isOcupado()) {
			for (String n : tabela[pos].getListaNomes()) {
				if (n.equals(nome)) {
					return pos;
				}
			}
		}
		return -1;
	}

	public void remover(String nome) {
		int pos = buscar(nome);
		if (pos != -1) {
			tabela[pos].getListaNomes().remove(nome);
			if (tabela[pos].getListaNomes().isEmpty()) {
				tabela[pos].setOcupado(false);
			}
			System.out.printf("-> Dado no HASH[%d] apagado!!\n", pos);
		} else {
			System.out.println("-> Item não encontrado!!");
		}
	}
}
