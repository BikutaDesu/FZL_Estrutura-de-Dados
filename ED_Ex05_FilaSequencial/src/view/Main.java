package view;

import collection.FilaSequencial;
import model.Pessoa;

public class Main {

	public static void main(String[] args) {
		FilaSequencial fila = new FilaSequencial(10);
		
		Pessoa p1 = new Pessoa(01, "Raizer", "raizer.v@algumacoisa.com");
		Pessoa p2 = new Pessoa(02, "Julio", "julio@algumacoisa.com");
		Pessoa p3 = new Pessoa(03, "Victor", "eu@algumacoisa.com");
		
		fila.enfileirar(p1);
		fila.enfileirar(p2);
		fila.enfileirar(p3);
		fila.exibirFila();
	
		System.out.println("\n-------------------------");
		fila.desenfileirar();
		fila.exibirFila();
		
		System.out.println("\n-------------------------");
		System.out.println(fila.buscar(2));
	}

}
