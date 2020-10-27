package curso_java.exercicios;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] numeros = new int[5];
		int maior = 0;
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digite um número:");
			numeros[i] = Integer.parseInt(sc.nextLine());

			if (numeros[i] > maior) {
				maior = numeros[i];
			}
		}
		
		System.out.println("O maior número é: " + maior);

		sc.close();

	}

}
