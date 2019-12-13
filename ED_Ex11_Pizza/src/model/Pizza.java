package model;

import java.util.HashMap;
import java.util.Map;

public class Pizza {
	static int indicePizza = 0;
	private String sabor;
	private double preco;

	Map<Integer, String> ingredientes = new HashMap<Integer, String>();

	private int indiceIngrediente = 0;
	private int numero_ingredientes = 0;

	public Pizza(String sabor) {
		this.sabor = sabor;
		indicePizza++;
	}

	public void escrevaNumeroPizzas() {
		System.out.println("NumeroPizza = " + getNumeroPizzas());
	}

	public void adicionaIngredientes(String ingrediente) {
		ingredientes.put(indiceIngrediente++, ingrediente);
		contabilizaIngrediente();
	}

	public void contabilizaIngrediente() {
		numero_ingredientes++;
	}

	public double getPreco() {
		if (ingredientes.size() <= 2)
			preco = 30;
		else if (ingredientes.size() <= 5)
			preco = 45;
		else
			preco = 60;
		return preco;
	}

	public int getNumeroIngredientes() {
		return numero_ingredientes;
	}

	public void listarIngredientes() {
		for (int i = 0; i < ingredientes.size(); i++)
			System.out.println(i + 1 + " - " + ingredientes.get(i));
	}

	public String getSabor() {
		return sabor;
	}
	
	public int getNumeroPizzas() {
		return indicePizza;
	}
}
