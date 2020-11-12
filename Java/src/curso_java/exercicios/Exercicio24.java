package curso_java.exercicios;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] produto = new String[10];
		double[] preco = new double[10];
		int[] quantidade = new int[10];
		String lixo;
		int menu = 0;
		int contCadastra = 0;
		int contVisualiza = 0;
		int compraProduto;
		int compraQuantidade;

		loop: do {
			System.out.println("1 - Cadastrar produto");
			System.out.println("2 - Visualisar estoque");
			System.out.println("3 - Comprar produto");
			System.out.println("4 - Sair");
			menu = sc.nextInt();
			switch (menu) {
			case 1:
				System.out.println("Digite o produto que deseja cadastrar: ");
				lixo = sc.nextLine();
				produto[contCadastra] = sc.nextLine();
				System.out.println("Digite o preço unitário do produto: ");
				preco[contCadastra] = sc.nextDouble();
				System.out.println("Digite a quantidade do produto: ");
				quantidade[contCadastra] = sc.nextInt();
				contCadastra++;
				break;
			case 2:
				for (int i = 0; i < produto.length; i++) {
					System.out.println(i + " - " + produto[i] + " - Preço Unitário: " + preco[i] + " - Quantidade: "
							+ quantidade[i]);
					if (produto[i] == null) {
						break;
					}
				}
				contVisualiza++;
				break;
			case 3:
				for (int i = 0; i < produto.length; i++) {
					System.out.println(i + " - " + produto[i] + " - Preço Unitário: " + preco[i] + " - Quantidade: "
							+ quantidade[i]);
					if (produto[i] == null) {
						break;
					}
				} // for
				System.out.print("Qual o produto que deseja comprar: ");
				compraProduto = sc.nextInt();
				System.out.print("Quantos produtos deseja comprar: ");
				compraQuantidade = sc.nextInt();

				if (compraQuantidade <= quantidade[compraProduto]) {

					quantidade[compraProduto] = quantidade[compraProduto] - compraQuantidade;
					System.out.println("Você vai pagar " + (compraQuantidade * preco[compraProduto]) + " reais");
				} // iff
				else {
					System.out.println("Quantidade inválida!");
				} // else

				break;
			case 4:
				System.out.println("Obrigado por usar o nosso Sistema");
				break loop;

			default:
				System.out.println("Opção invalida!");
				break;
			}

		} while (menu != 0);

		sc.close();

	}// public main
}// public class
