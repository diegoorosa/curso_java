package selecao.exemplo;

import java.util.Scanner;

public class Exemplo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escolha uma opção:");
		System.out.println("1 - Cadastro de pessoas");
		System.out.println("2 - Cadastro de produto");

		int opcao = Integer.parseInt(sc.nextLine());

		if (opcao == 1) {
			System.out.println("Entrou no cadastro de pessoas.");
		} else if (opcao == 2) {
			System.out.println("Entrou no cadastro de produto.");
		} else {
			System.out.println("Nenhuma opção valida");
		}

		sc.close();
	}

}
