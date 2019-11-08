package view;

import collection.Array;
import model.Aluno;

public class Main {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Victor");
		Aluno a2 = new Aluno("Raizer");
		Aluno a3 = new Aluno("Júlio");
		Array listaAluno = new Array(10);
		
		listaAluno.add(a1);
		listaAluno.add(a2);
		listaAluno.printObjects();
		listaAluno.add(a3,1);
		listaAluno.printObjects();
		
		listaAluno.printObject(1);
	}
}
