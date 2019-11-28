package view;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Principal {
	public static void main(String[] args) {
		BufferedReader br = lerArquivo("competidores.txt");
		int qtdCompetidores;
		int qtdClassificados;
		try {
			qtdCompetidores = Integer.parseInt(br.readLine());
			qtdClassificados = Integer.parseInt(br.readLine());
			int[] competidores = new int[qtdCompetidores];

			competidores = cadastrarCompetidores(competidores, br);

			int[] competidoresOrdenados = ordenarVetor(competidores);

			pegarQuantidadeAprovados(competidoresOrdenados, qtdClassificados);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static BufferedReader lerArquivo(String nomeArquivo) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(nomeArquivo));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return br;
	}

	public static void gravarArquivo(String nomeArquivo, int quantidadeClassificados) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(nomeArquivo));
			bw.write(quantidadeClassificados + "");
			bw.close();
		} catch (Exception e) {

		}
	}

	public static int[] cadastrarCompetidores(int[] competidores, BufferedReader br) {
		try {
			int indiceLaco = 0;
			String linha = br.readLine();
			while (linha != null) {
				competidores[indiceLaco] = Integer.parseInt(linha);
				linha = br.readLine();
				indiceLaco++;
			}
		} catch (IOException e) {
			e.printStackTrace();
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
				if (indiceCompetidor < 0) {
					break;
				} else {
					notaCompetidor = competidores[indiceCompetidor];
				}
			} while (notaAtual == notaCompetidor);
			if (indiceCompetidor < 0 || classificados > quantidadeClassificados) {
				break;
			}
		}
		gravarArquivo("competidoresClassificados.txt", classificados);
	}
}
