package view;

import collection.FilaEncadeada;
import model.Pessoa;

public class Main {

	public static void main(String[] args) {
		FilaEncadeada fila = new FilaEncadeada();
		
		Pessoa p1 = new Pessoa(01, "Raizer", "raizer.v@algumacoisa.com");
		Pessoa p2 = new Pessoa(02, "Julio", "julio@algumacoisa.com");
		Pessoa p3 = new Pessoa(03, "Victor", "eu@algumacoisa.com");
		
		fila.adicionar(p1);
		fila.adicionar(p2);
		fila.adicionar(p3);
		
		System.out.println("Tamanho: " + fila.getTamanho());
		System.out.println(fila.remover());
		
		System.out.println(fila.cortar());
		fila.adicionar(p1);
		System.out.println(fila.remover());
		
		System.out.println("Tamanho: " + fila.getTamanho());
		
	}

}
