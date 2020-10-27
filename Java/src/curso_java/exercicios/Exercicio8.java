package curso_java.exercicios;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] numeros = new int[10];

		int soma = 0;
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite um número: ");
			numeros[i] = sc.nextInt();
			soma = soma + numeros[i];
		}

		System.out.println("A soma de todos os números é: " + soma);

		sc.close();

	}

}
