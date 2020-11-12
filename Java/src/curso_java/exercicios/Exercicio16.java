package curso_java.exercicios;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {

		// faça um program aque leia 5 numeros e informe a soma e a media dos numeros

		Scanner sc = new Scanner(System.in);

		int num;
		double media = 0;
		int soma = 0;

		for (int i = 0; i < 5; i++) {
			System.out.print("Digite um numero: ");
			num = sc.nextInt();
			soma += num;
			

			
		} // for
		media = soma/5;
		
		System.out.println("");
		System.out.println("Soma: " + soma);
		System.out.println("Média: " + media);
		

		sc.close();

	}// public static main
}// public class exercicio11
