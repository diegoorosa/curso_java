package curso_java.exercicios;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {

		// fa�a um program aque leia 5 numeros e informe o maio numero

		Scanner sc = new Scanner(System.in);

		int num;
		int maior = Integer.MIN_VALUE;

		for (int i = 0; i < 5; i++) {
			System.out.print("Entre com um n�mero: ");
			num = sc.nextInt();

			if (num > maior) {
				maior = num;

			} // if

		} // for
		System.out.println("N�mero maior �: " + maior);

		sc.close();

	}// public static main
}// public class exercicio11
