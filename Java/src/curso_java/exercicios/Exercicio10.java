package curso_java.exercicios;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int m = sc.nextInt();
		System.out.print("Digite um número: ");
		int n = sc.nextInt();

		int resto;
		while (n != 0) {
			resto = m % n;
			m = n;
			n = resto;
		}
		System.out.println("MDC = " + m);

		sc.close();

	}

}
