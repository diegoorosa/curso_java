package curso_java.exercicios;

import java.util.Scanner;

/**
 * Menu de cafeteria, op��es: P-reto B-ranco c-hocolate Conforme a op�ao
 * selecionada, concatene, "tome aqui seu" + cafe preto, ou branco ou chocolate.
 */

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String tomar = "Tome aqui seu ";
		String preto = "Caf� Preto";
		String branco = "Caf� Branco";
		String chocolate = "Chocolate";
		System.out.println("******Menu******");
		System.out.println("P - Caf� Preto");
		System.out.println("B - Caf� Branco");
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
				System.out.println("Op��o inv�lida!");
				menu = "";
				break;
			}
		} while (menu != "P" && menu != "C" && menu != "B" && menu != "");

		sc.close();

	}

}
