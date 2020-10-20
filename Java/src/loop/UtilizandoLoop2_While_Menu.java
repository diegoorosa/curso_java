package loop;

import java.util.Scanner;

public class UtilizandoLoop2_While_Menu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		myLoop: while (true) {
			System.out.println("1 - Cadastro de produto");
			System.out.println("2 - Cadastro de pessoa");
			System.out.println("3 - Sair");
			int menu = Integer.parseInt(sc.nextLine());

			switch (menu) {
			case 1:
				System.out.println("Cadastro de produto");
				break;
			case 2:
				System.out.println("Cadastro de pessoa");
				break;
			case 3:
				break myLoop;

			default:
				System.out.println("Opção inválida");
				continue;
			}

			System.out.println("1 - Sair");
			System.out.println("2 - Voltar");
			menu = Integer.parseInt(sc.nextLine());
			switch (menu) {
			case 1:
				break myLoop;
			case 2:
				continue;
			default:
				System.out.println("Opção inválida");
				continue;
			}

		}

		sc.close();
	}

}
