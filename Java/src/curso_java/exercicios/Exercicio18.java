package curso_java.exercicios;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {

		// faca um programa que imprima na tela apenas os numeros impares entre 1 e 50

		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			} // if
		} // for

		sc.close();

	}// public static main
}// public class exercicio11
