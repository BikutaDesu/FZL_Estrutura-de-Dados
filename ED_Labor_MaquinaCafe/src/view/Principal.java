package view;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Principal {

	public static void main(String[] arrgs) {
		try {
			BufferedReader br = lerArquivo("andares.txt");
			int[] vetAndar = { Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine()),
					Integer.parseInt(br.readLine()) };
			int totalMinutos = (vetAndar[0] * 2) + (vetAndar[2] * 2);
			gravarArquivo("tempoTotal.txt", totalMinutos);
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

	public static void gravarArquivo(String nomeArquivo, int totalMinutos) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(nomeArquivo));
			bw.write(totalMinutos + "");
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
