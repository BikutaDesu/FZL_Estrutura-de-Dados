package view;

import java.util.Arrays;

import algs.AlgsOrdenacao;

public class Main {

	public static void main(String[] args) {

		final int[] arr = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };

		System.out.println("Vetor não ordenado: " + Arrays.toString(arr));
		
		int[] novoArr = new AlgsOrdenacao().mergeSort(arr, 0, arr.length-1);

		System.out.println("Vetor ordenado: " + Arrays.toString(novoArr));
		
	}

}
