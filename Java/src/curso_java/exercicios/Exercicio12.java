package curso_java.exercicios;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double A = 80000;
		double B = 200000;
		int ano = 0;
		do {
			
			A += (A * 0.03);
			B += (B * 0.015);
			ano++;
			
			if(A >= B) {
				break;
			}
						
			

		} while (true);
		
		System.out.println("O pa�s A ultrapassa o pa�s B depois de " + ano + " anos");
		System.out.printf("Pa�s A tem %.0f de popula��o%n", A);
		System.out.printf("Pa�s B tem %.0f de popula��o", B);
		
		

		
		
		
		
		
		
		
		
		sc.close();

	}// public static main
}// public class exercicio11
