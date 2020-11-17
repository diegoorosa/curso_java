package Orientacao_Objeto.Metodo3;

import java.util.Scanner;

public class TesteContaCorrente {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ContaCorrente contaCorrente = new ContaCorrente();
		contaCorrente.cadastrarConta();

		loop: do {
			System.out.println("---------1 - Saque -------------");
			System.out.println("---------2 - Deposito ----------");
			System.out.println("---------3 - Consulta Saldo ----");
			System.out.println("---------4 - Aumentar Limite ---");
			System.out.println("---------5 - Sair --------------");
			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				contaCorrente.saque();
				break;
			case 2:
				contaCorrente.deposito();
				break;
			case 3:
				contaCorrente.consultaSaldo();
				break;
			case 4:
				contaCorrente.aumentarLimite();
				break;
			case 5:
				System.out.println("Obrigado por usar o Sistema");
				break loop;

			default:
				System.out.println("Opção inválida!");
				break;
			}

		} while (true);

		sc.close();

	}// main

}// TesteContaCorrente
