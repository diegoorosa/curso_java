package curso_java.a_Loop;

import java.util.Scanner;

public class While01 {

	public static void main(String[] args) {
		// faça um programa que peça uma nota, entre zero e dez.
		// mostre uma mensagem caso o valor seja invalido e continue
		// pedindo ateh que o usuario inform eum valor valido

		Scanner sc = new Scanner(System.in);

		double nota;
		while (true) {
			System.out.print("Digite uma nota entre 0 e 10: ");
			nota = sc.nextDouble();

			if (nota < 0 || nota > 10) {
				System.out.println("Valor inválido");
			} else {
				break;
			} // if else

		} // while

		// Resolução do professor

		System.out.println("");
		System.out.println("Resolução do professor");
		boolean notaValida = false;
		do {
			System.out.println("Entre com a nota");
			double nota1 = sc.nextDouble();

			if (nota1 >= 0 && nota1 <= 10) {
				notaValida = true;
			} else {
				notaValida = false;
				System.out.println("Nota inválida, digite novamente");
			}

		} while (!notaValida);

		sc.close();
	}// public static main

}// class while01
