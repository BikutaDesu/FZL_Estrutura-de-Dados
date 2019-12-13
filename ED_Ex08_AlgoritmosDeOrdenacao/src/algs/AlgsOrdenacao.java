package algs;

public class AlgsOrdenacao {

	public int[] insertionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int j = i;
			while (j > 0 && arr[j - 1] > arr[j]) {
				int aux = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = aux;
				j--;
			}

		}
		return arr;
	}

	public int[] binaryInsertionSort(int arr[]) {
		for (int i = 1; i < arr.length; i++) {
			int j = i - 1;
			int selecionado = arr[i];
			int localizado = binarySearch(arr, selecionado, 0, j);
			while (j >= localizado) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = selecionado;
		}
		return arr;
	}

	private int binarySearch(int arr[], int item, int menor, int maior) {
		if (maior <= menor) {
			return (item > arr[menor]) ? (menor + 1) : menor;
		}
		int meio = (menor + maior) / 2;
		if (item == arr[meio]) {
			return meio + 1;
		}
		if (item > arr[meio])
			return binarySearch(arr, item, meio + 1, maior);
		return binarySearch(arr, item, menor, meio - 1);
	}

	public int[] selectionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int indice = indiceMenorValor(arr, i);
			swap(arr, i, indice);
		}
		return arr;
	}

	private int indiceMenorValor(int arr[], int inicio) {
		int menorValor = arr[inicio];
		int indiceDoMenor = inicio;
		for (int i = inicio + 1; i < arr.length; i++) {
			if (arr[i] < menorValor) {
				menorValor = arr[i];
				indiceDoMenor = i;
			}
		}
		return indiceDoMenor;
	}

	public int[] heapSort(int[] arr) {
		for (int i = arr.length / 2 - 1; i >= 0; i--) {
			heapify(arr, arr.length, i);
		}

		for (int i = arr.length - 1; i >= 0; i--) {
			swap(arr, 0, i);
			heapify(arr, i, 0);
		}
		return arr;
	}

	private int[] heapify(int[] arr, int n, int i) {
		int maior = i;
		int esq = 2 * i + 1;
		int dir = 2 * i + 2;

		if (esq < n && arr[esq] > arr[maior]) {
			maior = esq;
		}

		if (dir < n && arr[dir] > arr[maior]) {
			maior = dir;
		}

		if (maior != i) {
			swap(arr, i, maior);
			heapify(arr, n, maior);
		}
		return arr;
	}

	private void swap(int[] arr, int primeiroIndice, int segundoIndice) {
		int aux;
		aux = arr[primeiroIndice];
		arr[primeiroIndice] = arr[segundoIndice];
		arr[segundoIndice] = aux;
	}

	public int[] quickSort(int[] arr, int low, int high) {
		if (low < high) {
			int pi = partition(arr, low, high);
			quickSort(arr, low, pi - 1);
			quickSort(arr, pi + 1, high);
		}
		return arr;
	}

	private int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = (low - 1);

		for (int j = low; j <= high - 1; j++) {
			if (arr[j] <= pivot) {
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i + 1, high);
		return i + 1;
	}

	public int[] mergeSort(int[] arr, int p, int r) {
		int q;
		if (p < r) {
			q = (p + r) / 2;
			mergeSort(arr, p, q);
			mergeSort(arr, q + 1, r);
			merge(arr, p, q, r);
		}
		return arr;
	}

	private int[] merge(int[] arr, int p, int q, int r) {
		int[] nArr = new int[arr.length];
		int i = p;
		int j = q + 1;
		int k = 0;
		while (i <= q && j <= r) {
			if (arr[i] < arr[j]) {
				nArr[k++] = nArr[i++];
			} else {
				nArr[k++] = arr[j++];
			}

		}
		while (i <= q) {
			nArr[k++] = arr[i++];
		}
		while (j <= r) {
			nArr[k++] = arr[j++];
		}
		for (i = r; i >= p; i--) {
			arr[i] = nArr[--k];
		}
		return arr;
	}

}
