package curso_java.exercicios;

import java.util.Scanner;

public class Exercicio21_Matriz {

	public static void main(String[] args) {

		// Capture do teclado valores para preenchimento de uma matriz M 3x3
		// Apos a captura imprima a matriz criara e econtre a quantidad de
		// numeros pares e numeros impares
		Scanner sc = new Scanner(System.in);

		int[][] matriz = new int[3][3];
		int par = 0;
		int impar = 0;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print("Digite um número inteiro: ");
				matriz[i][j] = sc.nextInt();

				if (matriz[i][j] % 2 == 0) {
					par++;
				} else {
					impar++;
				} // if else

			} // for
		} // for

		System.out.println("Quantidade de números pares: " + par);
		System.out.println("Quantidade de números ímpares: " + impar);

		sc.close();

	}// public main
}// public class
