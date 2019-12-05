package exercicios;

public class Exercicio03 {
	
	public static void main(String[] args) {
		int[] vetorNumero = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		
		System.out.println(pesquisaBin(40, vetorNumero, 0, vetorNumero.length));
	}
	
	static int pesquisaBin(int x, int[] v,int esq,int dir) {
		int p = (esq + dir) / 2;
		if(esq >= dir) return -1;
		if(x == v[p]) return v[p]; 
		else if(x > v[p]) {
			return pesquisaBin(x, v, p+1, dir);
		}else {
			return pesquisaBin(x, v, esq, p-1);
		}
	}
}
