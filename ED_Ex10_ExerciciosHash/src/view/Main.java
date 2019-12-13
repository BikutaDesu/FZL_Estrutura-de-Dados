package view;

import java.util.Scanner;

import collection.HashLinearV3;

public class Main {

	public static void main(String[] args) {
		HashLinearV3 tabela = new HashLinearV3(26);
		Scanner sc = new Scanner(System.in);
		String nome;

		System.out.println("\n*******************************************************");
		System.out.println("Tabela HASH com tratamento de colisoes Linear (7 itens reais - double)");
		System.out.print("*********************************************************************");
		for (int i = 0; i < 7; i++) {
			System.out.print("\n\nInserindo elemento " + (i + 1));
			System.out.print(" - Informe um nome: ");
			nome = sc.next();
			tabela.inserir(nome);
		}

		System.out.print("\n\nBuscando campo\n>>> Forneca o nome: ");
		nome = sc.next();
		if (tabela.buscar(nome) != -1)
			System.out.print("Item encontrado na posicao " + tabela.buscar(nome));
		else
			System.out.print("Item nao encontrado");

		System.out.print("\n\nApagando campo\n>>> Forneca um nome: ");
		nome = sc.next();
		tabela.remover(nome);

		System.out.print("\n\nImprimindo conteudo");
		tabela.imprimir();

		System.out.println("\n");
	}

}
