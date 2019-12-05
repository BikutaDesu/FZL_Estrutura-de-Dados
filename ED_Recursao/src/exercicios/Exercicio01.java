package exercicios;

public class Exercicio01 {

	public static void main(String[] args) {
		System.out.println(s(3));
	}

	static int s(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n + s(n - 1);
		}
	}

}
