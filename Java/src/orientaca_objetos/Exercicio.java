package orientaca_objetos;

import java.util.Scanner;

public class Exercicio {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String retorno = " tem ";

		while (true) {
			try {
				String nome = perguntaNome();
				int idade = perguntaIdade();
				retorno = nome + retorno + idade + " anos.";
				break;

			} catch (Exception e) {
			}
		} 
		System.out.println(retorno);
		sc.close();

	}

	private static int perguntaIdade() {
		int idade = 0;
		System.out.print("Escreva sua idade: ");
		idade = Integer.parseInt(sc.nextLine());
		return idade;
	}

	private static String perguntaNome() {
		String nome = "";
		System.out.print("Escreva seu nome: ");
		nome = sc.nextLine();
		return nome;
	}

}
