package curso_java.exercicios;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro número:");
		int x = Integer.parseInt(sc.nextLine());

		System.out.println("Digite o segundo número:");
		int y = Integer.parseInt(sc.nextLine());

		for (int i = 1; i < y; i++) {
			x *= x;

		}

		System.out.println("A potencia o primeiro número pelo segundo é: " + x);

		sc.close();

	}

}
