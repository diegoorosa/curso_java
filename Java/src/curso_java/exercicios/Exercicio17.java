package curso_java.exercicios;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {

		// faca um program que receba dois numeros inteiro e gere os numeros inteiros
		// que estao no intervalo compreendido por eles.

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um numero inteiro: ");
		int num1 = sc.nextInt();
		System.out.print("Digite um numero inteiro: ");
		int num2 = sc.nextInt();

		for (int i = (num1 + 1); i < num2; i++) {
			System.out.println(i);

		}

		sc.close();

	}// public static main
}// public class exercicio11
