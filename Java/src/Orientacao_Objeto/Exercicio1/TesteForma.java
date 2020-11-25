package Orientacao_Objeto.Exercicio1;

import java.util.Scanner;

public class TesteForma {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		loop: do {
			System.out.println("1 - Calcular a �rea do Quadrado");
			System.out.println("2 - Calcular a �rea do Tri�ngulo");
			System.out.println("3 - Calcular a �rea do Ret�ngulo");
			System.out.println("4 - Calcular a �rea do C�rculo");
			System.out.println("5 - Calcular a �rea do Trap�zio");
			System.out.println("6 - Calcular a �rea do Paralelogramo");
			System.out.println("7 - Sair");
			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				Quadrado quadrado = new Quadrado();

				System.out.print("Digite a altura do quadrado: ");
				quadrado.setAltura(sc.nextDouble());
				quadrado.calcularArea();
				System.out.println("A �rea do quadrado: " + quadrado.getArea());
				System.out.println();

				break;
			case 2:
				Triangulo triangulo = new Triangulo();

				System.out.print("Digite a altura do tri�ngulo: ");
				triangulo.setAltura(sc.nextDouble());
				System.out.print("Digite a base do tri�ngulo: ");
				triangulo.setBase(sc.nextDouble());
				triangulo.calcularArea();
				System.out.println("A �rea do tri�ngulo: " + triangulo.getArea());
				System.out.println();

				break;
			case 3:
				Retangulo retangulo = new Retangulo();

				System.out.print("Digite a altura do ret�ngulo: ");
				retangulo.setAltura(sc.nextDouble());
				System.out.print("Digite a base do ret�ngulo: ");
				retangulo.setBase(sc.nextDouble());
				retangulo.calcularArea();
				System.out.println("A �rea do ret�ngulo: " + retangulo.getArea());
				System.out.println();

				break;
			case 4:
				Circulo circulo = new Circulo();

				System.out.print("Digite o raio do c�rculo: ");
				circulo.setRaio(sc.nextDouble());
				circulo.calcularArea();
				System.out.println("A �rea do c�rculo: " + circulo.getArea());
				System.out.println();

				break;
			case 5:
				Trapezio trapezio = new Trapezio();

				System.out.print("Digite a base maior do trapezio: ");
				trapezio.setBase(sc.nextDouble());
				System.out.print("Digite a base menor do trapezio: ");
				trapezio.setBaseMenor(sc.nextDouble());
				System.out.print("Digite a altura do trapezio: ");
				trapezio.setAltura(sc.nextDouble());
				trapezio.calcularArea();
				System.out.println("A �rea do trapezio: " + trapezio.getArea());
				System.out.println();

				break;
			case 6:
				Paralelogramo paralelogramo = new Paralelogramo();

				System.out.print("Digite a base do paralelogramo: ");
				paralelogramo.setBase(sc.nextDouble());
				System.out.print("Digite a altura do paralelogramo: ");
				paralelogramo.setAltura(sc.nextDouble());
				paralelogramo.calcularArea();
				System.out.println("A �rea do paralelogramo: " + paralelogramo.getArea());
				System.out.println();

				break;
			case 7:
				System.out.println("Obrigado por usar o sistema de C�lculo de �rea");
				break loop;

			default:
				System.out.println("Opc��o Inv�lida!");
				System.out.println();
				break;
			}//swtich
		} while (true);

		sc.close();

	}//main

}//TesteForma
