package curso_java.exercicios;


import java.util.Locale;
import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US); // pode usar 1.5 ao inves de 1,5
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a popula��o inicial da cidade A: ");
		double A = sc.nextDouble();
		System.out.print("Digite o indice de crescimento da cidade A: ");
		double indiceA = sc.nextDouble();

		System.out.print("Digite a popula��o inicial da cidade B: ");
		double B = sc.nextDouble();
		System.out.print("Digite o indice de crescimento da cidade B: ");
		double indiceB = sc.nextDouble();

		int ano = 0;
		do {

			A += (A / 100) * indiceA;
			B += (B / 100) * indiceB;

			ano++;

			if (A >= B) {
				break;
			}

		} while (true);

		System.out.println("");
		System.out.println("O pa�s A ultrapassa o pa�s B depois de " + ano + " anos");
		System.out.printf("Pa�s A tem %.0f de popula��o%n", A);
		System.out.printf("Pa�s B tem %.0f de popula��o", B);

		sc.close();

	}// public static main
}// public class exercicio11
