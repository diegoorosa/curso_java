package curso_java.exercicios;

import java.util.Random;

public class Exercicio20_Matriz {

	public static void main(String[] args) {

		// Criar uma matriz 4x4 e mostrar o maior numero dela
		// valores aleatorios

		int[][] matriz = new int[4][4];
		Random numeroRandom = new Random();

//		matriz[0][0] = 30;
//		matriz[0][1] = 90;
//		matriz[0][2] = 158;
//		matriz[0][3] = 12;
//		matriz[1][0] = 155;
//		matriz[1][1] = 85;
//		matriz[1][2] = 45;
//		matriz[1][3] = 7;

		int valorMaior = 0;
		int posicaoI = 0;
		int posicaoJ = 0;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = numeroRandom.nextInt(100);
			}

		}

		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz[i].length; j++) {

				if (matriz[i][j] > valorMaior) {
					valorMaior = matriz[i][j];
					posicaoI = i;
					posicaoJ = j;
				}

			} // for

		} // for

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();

		System.out.println("O maior valor é: " + valorMaior + "[" + posicaoI + "][" + posicaoJ + "]");

		// Usando com Random

	}// public main
}// public class
