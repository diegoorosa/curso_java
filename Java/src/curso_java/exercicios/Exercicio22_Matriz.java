package curso_java.exercicios;

import java.util.Scanner;

public class Exercicio22_Matriz {

	public static void main(String[] args) {

		// Faça um programa para armazenar em uma matriz os compromissos de uma agenda
		// pessoal.
		// Cada dia do mês deve conter 24 horas, onde para cada um destas 24 horas
		// podemos associar
		// uma tarefa específica (compromisso agendado). O programa deve ter um menu
		// onde o usuário
		// indica o dia do mês que deseja alterar e a hora, entrando em seguida com o
		// compromisso,
		// ou então, o usuário pode também consultar a agenda, fornecendo o dia e a hora
		// para
		// obter o compromisso armazenado.

		Scanner sc = new Scanner(System.in);

		String[][] agenda = new String[30][24];

		int dia = 0;
		int hora = 0;
		String sair = "";
		do {
			System.out.println("Adicionar agenda (1)");
			System.out.println("Visualizar agenda (2)");
			System.out.println("Imprimir a agenda (3)");
			System.out.print("Digite a opção: ");
			int menu = sc.nextInt();
			switch (menu) {
			case 1:
				System.out.print("Digite o dia que quer adicionar o compromisso(1 a 30): ");
				dia = sc.nextInt();
				System.out.print("Digite a hora que quer adicionar o compromisso(1 a 24): ");
				hora = sc.nextInt();

				System.out.print("Digite o compromisso: ");
				String compromisso = sc.next();
				agenda[dia - 1][hora - 1] = compromisso;
				dia = 0;
				hora = 0;
				break;

			case 2:
				System.out.print("Digite o dia para ver o compromisso(1 a 30): ");
				dia = sc.nextInt();
				System.out.print("Digite a hora para ver o compromisso(1 a 24): ");
				hora = sc.nextInt();
				System.out.println(agenda[dia - 1][hora - 1]);
				dia = 0;
				hora = 0;

				break;
			case 3:
				for (int i = 0; i < agenda.length; i++) {
					for (int j = 0; j < agenda[i].length; j++) {
						System.out.print(agenda[i][j]);
					}
					System.out.println();
				}
				break;
			default:
				System.out.println("Opção inválida!");
				continue;
			}

			System.out.println("Deseja sair? S/N");
			sair = sc.next();

		} while (sair.equalsIgnoreCase("n"));
		System.out.println("Obrigado por usado a agenda!");

		sc.close();

	}// public main
}// public class
