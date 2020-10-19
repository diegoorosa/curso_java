package curso_java.exercicios;

import java.util.Scanner;

/**
 * 1 - Fa�a um menu Pergunte o nome Pergunte a idade Pergunte se a pessoa sabe
 * dirigir Pergunte se a pessoa � parente do dono da autoescola se a idade da
 * pessoa for maior que 18 e a pessoa sabe dirigir ou se a pessoa � arente do dono da auto escola 
 * Escreva: fulato esta apto a dirigir 
 * Senao escreva: fulano nao esta apto para dirigir 
 * 2 - Fa�a o menu: TURMAS DISPONIVEIS Pergunte a quantidade de pessoas prestes a estudar para tirar a carteira
 * Se a quantidade de pessoas prestes a cursar for menor ou igual a 2 
 * Escreva: H� vagas
 * Senao escreva: N�o h� vagas
 */

public class Exercicio3_Bug_Interger_parseInt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int menu = 0;
		
		do {			
			System.out.println("**************************");
			System.out.println("      Auto Escola JAVA    ");
			System.out.println("**********MENU************");
			System.out.println("1 - APTO A DIRIGIR");
			System.out.println("2 - TURMAS DISPONIVEIS");
			System.out.println("3 - SAIR");
			menu = Integer.parseInt(sc.nextLine());

			if (menu == 1) {

				System.out.print("Digite seu nome: ");
				String nome = sc.nextLine();

//				Usar Integer.parseInt com next.line quando tiver o bug
				System.out.print("Digite sua idade: ");
				int idade = Integer.parseInt(sc.nextLine());

				System.out.println("Voc� sabe dirigir? S/N");
				String dirigir = sc.nextLine();

				System.out.println("Voc� � parente do dono da autoescola? S/N");
				String parente = sc.nextLine();

				if ((idade >= 18 && dirigir.equalsIgnoreCase("S")) || (parente.equalsIgnoreCase("S"))) {
					System.out.printf("%s est� apto para dirigir\n", nome);
				} else {
					System.out.printf("%s n�o est� apto para dirigir\n", nome);
				}
				
				menu = 4;

			} else if (menu == 2) {
				System.out.println("Quantas pessoas v�o querer tirar a carteira?");
				int quantidade = Integer.parseInt(sc.nextLine());

				if (quantidade == 0) {
					System.out.println("Quantidade inv�lida");
				} else if(quantidade <= 2) {
					System.out.println("H� vagas!");
				}else {
					System.out.println("N�o h� vagas!");
				}

			} else if (menu == 3){
				System.out.println("Obrigado!");
			} else {
				System.out.println("Op��o Inv�lida!");
			}
			
			menu = 4;

		} while (menu != 1 && menu != 2 && menu != 3);
		
		sc.close();
	}

}
