package curso_java.exercicios;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		int tamanho = 0;
//		int[] salarios = new int[tamanho];

		boolean verifica = true;
		int totalAbono = 0;
		int totalMinimo = 0;
		int maiorAbono = 0;
		int i = 0;

		while (verifica) {
			i++;

			System.out.print("Digite um salario: ");
			int salario = sc.nextInt();
			int abono = (salario * 20) / 100;

			if (salario == 0) {
				break;

			}

			if (abono <= 100) {
				abono = 100;
				totalMinimo++;
			}

			totalAbono = totalAbono + abono;

			if (abono > maiorAbono) {
				maiorAbono = abono;
			}

		}

		System.out.println("Foram processados " + (i - 1) + " colaboradores");
		System.out.println("Total gasto com abonos: " + totalAbono);
		System.out.println("Valor mínimo pago a " + totalMinimo + " colaboradores");
		System.out.println("Maior valor de abono pago: R$ " + maiorAbono);

		sc.close();

	}
}
