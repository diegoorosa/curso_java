package curso_java.exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos alunos tem na sala?");
		int quantidade = Integer.parseInt(sc.nextLine());

		String[] vetorNomes = new String[quantidade];
		int[] vetorIdade = new int[quantidade];

		for (int i = 0; i < quantidade; i++) {
			System.out.println("Digite o nome do " + (i + 1) + "� aluno:");
			vetorNomes[i] = sc.nextLine();
			System.out.println("Digite a idade do " + vetorNomes[i]);
			vetorIdade[i] = Integer.parseInt(sc.nextLine());

		}

		System.out.println("--------\n");

		for (int i = 0; i < quantidade; i++) {
			System.out.println(
					"Nome do " + (i + 1) + "� aluno: " + vetorNomes[i] + ", ele(a) tem " + vetorIdade[i] + " anos.");
		}

		System.out.println("-----\n");
		System.out.println("Nomes por �rdem alfab�tica:");

		Arrays.sort(vetorNomes);

		int cont = 0;
		for (String ordenando : vetorNomes) {
			System.out.println("Nome do " + (cont + 1) + "� aluno: " + ordenando);
			cont++;

		}

		sc.close();

	}

}
