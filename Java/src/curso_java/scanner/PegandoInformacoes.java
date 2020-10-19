package curso_java.scanner;

import java.util.Scanner;

public class PegandoInformacoes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Escreva seu nome: ");
		String nome = sc.nextLine();
//		sc.next pega a proxima palavra
//		sc.nextLine pega a linha inteira

		System.out.println("Oi " + nome);
		System.out.println("tudo bem?");
//		System.out.println("oi\t" + nome + "\ntudo bem?");

		System.out.println("");

		System.out.println("Qual o seu sobrenome: ");
		String sobrenome = sc.next();
		System.out.println("Muito prazer " + nome + " " + sobrenome);

		System.out.println("Escreva o primeiro valor:");
		int valorUm = sc.nextInt();
//		sc.nextInt pega o proximo valor inteiro
		System.out.println("Escreva o segundo valor:");
		int valorDois = sc.nextInt();

		System.out.println("A soma dos valores é " + (valorUm + valorDois));

		System.out.println("Escreva o ano do seu aniversário");
		int nascimento = sc.nextInt();
		System.out.println("Escreva o ano atual");
		int dataAtual = sc.nextInt();
		System.out.println("Você tem " + (dataAtual - nascimento) + " anos");

		sc.close();
	}

}
