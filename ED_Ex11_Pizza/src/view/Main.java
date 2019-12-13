package view;

import model.CarrinhoDeCompra;
import model.Pizza;

public class Main {

	public static void main(String[] args) {
		Pizza p1 = new Pizza("Chocolate");
		Pizza p2 = new Pizza("Tomate seco");
		Pizza p3 = new Pizza("Brócolis");

		CarrinhoDeCompra c1 = new CarrinhoDeCompra();

		// p1.escrevaNumeroPizzas();
		// p2.escrevaNumeroPizzas();
		// p3.escrevaNumeroPizzas();
		// p4.escrevaNumeroPizzas();

		p1.adicionaIngredientes("chocolate");
		p1.adicionaIngredientes("morango");

		p2.adicionaIngredientes("tomate seco");
		p2.adicionaIngredientes("queijo");
		p2.adicionaIngredientes("azeitona");

		p3.adicionaIngredientes("queijo");
		p3.adicionaIngredientes("tomate");
		p3.adicionaIngredientes("azeitona");
		p3.adicionaIngredientes("bacon");
		p3.adicionaIngredientes("brocolis");
		p3.adicionaIngredientes("palmito");

		System.out.println("\n-> Ingredientes da Pizza p2");
		p2.listarIngredientes();

		System.out.println("\n-> Ingredientes da Pizza p3");
		p3.listarIngredientes();

		System.out.println("\n-> Ingredientes da Pizza p1");
		p1.listarIngredientes();

		c1.adicionarItem(p1);
		c1.adicionarItem(p2);
		c1.adicionarItem(p3);


		System.out.println("\n-> Total de pizzas" + " disponiveis = " + p2.getNumeroPizzas());

		System.out.println("\n-> Total de pizzas no carrinho c1... " + " " + c1.totalPizzasAdicionadas());

		System.out.println("\n-> Total a pagar pelo carrinho c1... " + " " + c1.getTotalPagar());

		System.out.println("\n-> Ingredientes da Pizza p1 ");
		p1.listarIngredientes();
		System.out.println("\n-> Preco da Pizza p1 = " + p1.getPreco());

		System.out.println("\n-> Ingredientes da Pizza p2 ");
		p2.listarIngredientes();
		System.out.println("\n-> Preco da Pizza p2 = " + p2.getPreco());

		System.out.println("\n-> Ingredientes da Pizza p3 ");
		p3.listarIngredientes();
		System.out.println("\n-> Preco da Pizza p3 = " + p3.getPreco());

		System.out.println("\n-> Itens do carrinho c1 ");
		c1.listarItens();

	}

}
