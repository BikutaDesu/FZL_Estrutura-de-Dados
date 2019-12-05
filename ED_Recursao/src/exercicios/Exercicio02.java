package exercicios;

public class Exercicio02 {

	public static void main(String[] args) {
		System.out.println(sf(5));
	}
	
	static int sf(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * sf(n - 1);
		}
	}

}
