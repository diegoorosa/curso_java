package curso_java.exercicios;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro n�mero:");
		int x = Integer.parseInt(sc.nextLine());

		System.out.println("Digite o segundo n�mero:");
		int y = Integer.parseInt(sc.nextLine());

		for (int i = 1; i < y; i++) {
			x *= x;

		}

		System.out.println("A potencia o primeiro n�mero pelo segundo �: " + x);

		sc.close();

	}

}
