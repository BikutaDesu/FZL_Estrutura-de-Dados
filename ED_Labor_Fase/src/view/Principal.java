package view;

import java.util.Random;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		int[] competidores = null;
		competidores = definirQuantidadeCompetidores(competidores);
		int quantidadeClassificados = definirQuantidadeAprovados(competidores.length);
		competidores = cadastrarCompetidores(competidores);
		int[] classificacaoCompetidores = ordenarVetor(competidores);

//		for (int i = 0; i < classificacaoCompetidores.length; i++) {
//			System.out.println(classificacaoCompetidores[i]);
//		}
		pegarQuantidadeAprovados(classificacaoCompetidores, quantidadeClassificados);
	}

	public static int definirQuantidadeAprovados(int quantidadeCompetidores) {
		int quantidade = 0;
		Scanner sc = new Scanner(System.in);
		do {
//			System.out.print("Quantidade de notas para classificação: ");
			quantidade = sc.nextInt();
			if (quantidade < 1 || quantidade > quantidadeCompetidores) {
				System.out.println("Número inválido!! por favor digite um numero entre 1 e 1000");
			}
		} while (quantidade < 1 || quantidade > quantidadeCompetidores);
		return quantidade;
	}

	public static int[] definirQuantidadeCompetidores(int[] competidores) {
		Scanner sc = new Scanner(System.in);
		int quantidadeCompetidores = 0;
		do {
//			System.out.print("Digite a quantidade de competidores: ");
			quantidadeCompetidores = sc.nextInt();
			if (quantidadeCompetidores < 1 || quantidadeCompetidores > 1000) {
				System.out.println("Número inválido!! por favor digite um numero entre 1 e 1000");
			}
		} while (quantidadeCompetidores < 1 || quantidadeCompetidores > 1000);
		competidores = new int[quantidadeCompetidores];
		return competidores;
	}

	public static int[] cadastrarCompetidores(int[] competidores) {

//		System.out.println("\nAgora digite as notas de cada competidor\n");
		for (int i = 0; i < competidores.length; i++) {
			int pontuacao = 0;
			do {
//				System.out.printf("Competidor %d - nota: ", i + 1);
//				pontuacao = sc.nextInt();
//				if (pontuacao < 1 || pontuacao > 1000) {
//					System.out.println("Nota inválida!! por favor digite um numero entre 1 e 1000");
//				}
				pontuacao = new Random().nextInt(1001);
//				System.out.printf("Competidor %d - nota: %d\n", i + 1, pontuacao);
				System.out.printf("%d\n", pontuacao);
			} while (pontuacao < 1 || pontuacao > 1000);
			competidores[i] = pontuacao;
		}
		return competidores;
	}

	public static int[] ordenarVetor(int[] competidores) {
		for (int i = 0; i < competidores.length - 1; i++) {
			for (int j = i + 1; j < competidores.length; j++) {
				if (competidores[i] > competidores[j]) {
					int aux = competidores[i];
					competidores[i] = competidores[j];
					competidores[j] = aux;
				}
			}
		}
		return competidores;
	}

	public static void pegarQuantidadeAprovados(int[] competidores, int quantidadeClassificados) {
		int classificados = 0;
		int indiceCompetidor = competidores.length - 1;
		for (int i = 0; i < quantidadeClassificados; i++) {
			int notaAtual = competidores[indiceCompetidor];
			int notaCompetidor = notaAtual;
			do {
				classificados++;
				indiceCompetidor--;
				notaCompetidor = competidores[indiceCompetidor];
			} while (notaAtual == notaCompetidor);
		}
//		System.out.printf("Quantidade de classificados: %d\n", classificados);
		System.out.printf("%d\n", classificados);
	}
}
