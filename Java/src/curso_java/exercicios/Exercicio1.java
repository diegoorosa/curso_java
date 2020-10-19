package curso_java.exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o seu nome: ");
		String nome = sc.nextLine();

		System.out.print("Digite sua idade: ");
		int idade = sc.nextInt();

		if (idade >= 18) {
			System.out.println("Bem vindo(a) a festa " + nome + "!!!");
		} else {
			System.out.println("Você não tem idade para entrar na festa " + nome + ".");
		}

		sc.close();
	}

}
