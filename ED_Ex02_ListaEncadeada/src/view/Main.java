package view;

import collection.ListaLigada;
import model.Livro;

public class Main {

	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		
		lista.adicionarNovo(1010, "Neuromancer", "William Gibson", 39.90);
		lista.adicionarNovo(1011, "Monalisa Overdrive", "William Gibson", 39.90);
		lista.adicionarNovo(1012, "Count Zero", "William Gibson", 39.90);
		lista.exibirTodos();
		System.out.println("-------------------------------------------------------------");
		lista.adicionarNovo(3, 1013, "Farenheit 451", "Ray Bradbury", 39.90);
		lista.adicionarNovoPrimeiro(1014, "Não Conte a Ninguém", "Harlan Coben", 39.90);
		lista.exibirTodos();
//		System.out.println("-------------------------------------------------------------");
//		lista.remover();
//		lista.exibirTodos();
//		System.out.println("-------------------------------------------------------------");
//		lista.remover(1);
//		lista.exibirTodos();
//		System.out.println("-------------------------------------------------------------");
//		Livro livro = lista.getLivro(2);
//		lista.buscar(livro);
	}

}
