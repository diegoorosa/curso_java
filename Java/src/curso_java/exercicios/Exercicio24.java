package curso_java.exercicios;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		double x1, y1, x2, y2, distancia;

		System.out.println("Entre com as coordenadas x e y dos pontos nesta ordem:");
		x1 = teclado.nextFloat();
		y1 = teclado.nextFloat();
		x2 = teclado.nextFloat();
		y2 = teclado.nextFloat();

//										18 - 17 = 1 * 1 // + // 18 - 17 =   
		distancia = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 3/2);
		System.out.println("A distância é: " + distancia);

	}// public main
}// public class


//18
//13
//15
//18