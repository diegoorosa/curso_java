package curso_java.exercicios;

import java.util.Scanner;

public class TesteOperadorLogico2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int valorSorteado = 5;

		System.out.print("Escolha seu nome: ");
		String nome = sc.nextLine();

		System.out.print("Escolha um n�mero: ");
		int numeroEscolhido = Integer.parseInt(sc.nextLine());

		if (valorSorteado == numeroEscolhido || nome.equalsIgnoreCase("Diego")) {
			System.out.println("Parabens, ganhou um joinha!");
		} else {
			System.out.println("N�o ganhou, tente outra vez.");
		}

		sc.close();

	}

}
