package collection;

public class HashLinearV1 {

	private HashV1[] tabela;
	private int TAM_MAX;

	public HashLinearV1(int tamanho) {
		tabela = new HashV1[tamanho];
		TAM_MAX = tamanho;
		for (int i = 0; i < tabela.length; i++) {
			tabela[i] = new HashV1();
		}
	}

	public int hash(String nome) {
		char primeiraLetra = nome.toLowerCase().charAt(0);
		return Math.abs((int) primeiraLetra - (int) 'a');
	}

	public void inserir(String nome) {
//		if (isCheia()) {
//			System.out.println("\n-> TABELA CHEIA!!");
//		}

		int pos = hash(nome);
//		if (tabela[pos].isOcupado()) {
//
//			if (tabela[pos].getNome().equals(nome)) {
//				System.out.println("\n-> ITEM JÁ CADASTRADO!!");
//				return;
//			}
//
//			System.out.println("-> COLISÃO NA POSIÇÃO " + pos);
//			while (pos < TAM_MAX) {
//				if (pos == TAM_MAX - 1) {
//					pos = -1;
//				}
//				pos++;
//				if (!tabela[pos].isOcupado()) {
//					break;
//				}
//			}
//		}
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
				System.out.printf("\nHASH[%d] = %s", i, tabela[i].getNome());
			}
		}
	}

	public int buscar(String nome) {
		int pos = hash(nome);
		if (tabela[pos].isOcupado()) {
			if (tabela[pos].getNome().equals(nome)) {
				return pos;
			}

//			int inicioBusca = pos;
//			while (pos < TAM_MAX) {
//				if (pos == TAM_MAX - 1) {
//					pos = -1;
//				}
//				pos++;
//				if (tabela[pos].isOcupado() && tabela[pos].getNome() == nome) {
//					return pos;
//				}
//				if (pos == inicioBusca) {
//					return -1;
//				}
//			}
		}
		return -1;
	}

	public void remover(String nome) {
		int pos = buscar(nome);
		if (pos != -1) {
			tabela[pos].setOcupado(false);
			System.out.printf("-> Dado HASH[%d] apagado!!\n", pos);
		} else {
			System.out.println("-> Item não encontrado!!");
		}
	}
}
