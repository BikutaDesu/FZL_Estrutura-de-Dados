package view;

import collection.PilhaEncadeada;
import model.Livro;

public class Main {

	public static void main(String[] args) {
		PilhaEncadeada pilhaEncadeada = new PilhaEncadeada();
		
		Livro l1 = new Livro(1010, "Neuromancer", "William Gibson", 39.90);
		Livro l2 = new Livro(1011, "Monalisa Overdrive", "William Gibson", 39.90);
		Livro l3 = new Livro(1012, "Count Zero", "William Gibson", 39.90);
		Livro l4 = new Livro(1013, "Farenheit 451", "Ray Bradbury", 39.90);
		
		pilhaEncadeada.push(l1);
		pilhaEncadeada.push(l2);
		pilhaEncadeada.push(l3);
		pilhaEncadeada.push(l4);
		System.out.println("Tamanho " + pilhaEncadeada.getTamanho());
		System.out.println(pilhaEncadeada.pop());
		System.out.println(pilhaEncadeada.top());
		
	}
	
}
