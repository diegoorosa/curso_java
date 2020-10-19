package curso_java.exercicios;

import java.util.Scanner;

/**
 * Menu de cafeteria, opções: P-reto B-ranco c-hocolate Conforme a opçao
 * selecionada, concatene, "tome aqui seu" + cafe preto, ou branco ou chocolate.
 */

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String tomar = "Tome aqui seu ";
		String preto = "Café Preto";
		String branco = "Café Branco";
		String chocolate = "Chocolate";
		System.out.println("******Menu******");
		System.out.println("P - Café Preto");
		System.out.println("B - Café Branco");
		System.out.println("C - Chocolate");
		String menu = sc.nextLine().toUpperCase();

		do {
			switch (menu) {
			case "P":
				System.out.println(tomar + preto);
				menu = "";
				break;
			case "B":
				System.out.println(tomar + branco);
				menu = "";
				break;
			case "C":
				System.out.println(tomar + chocolate);
				menu = "";
				break;
			default:
				System.out.println("Opção inválida!");
				menu = "";
				break;
			}
		} while (menu != "P" && menu != "C" && menu != "B" && menu != "");

		sc.close();

	}

}
