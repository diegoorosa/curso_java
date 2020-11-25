package Orientacao_Objeto.Exercicio1;

import java.util.Scanner;

public class TesteForma {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		loop: do {
			System.out.println("1 - Calcular a Área do Quadrado");
			System.out.println("2 - Calcular a Área do Triângulo");
			System.out.println("3 - Calcular a Área do Retângulo");
			System.out.println("4 - Calcular a Área do Círculo");
			System.out.println("5 - Calcular a Área do Trapézio");
			System.out.println("6 - Calcular a Área do Paralelogramo");
			System.out.println("7 - Sair");
			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				Quadrado quadrado = new Quadrado();

				System.out.print("Digite a altura do quadrado: ");
				quadrado.setAltura(sc.nextDouble());
				quadrado.calcularArea();
				System.out.println("A área do quadrado: " + quadrado.getArea());
				System.out.println();

				break;
			case 2:
				Triangulo triangulo = new Triangulo();

				System.out.print("Digite a altura do triângulo: ");
				triangulo.setAltura(sc.nextDouble());
				System.out.print("Digite a base do triângulo: ");
				triangulo.setBase(sc.nextDouble());
				triangulo.calcularArea();
				System.out.println("A área do triângulo: " + triangulo.getArea());
				System.out.println();

				break;
			case 3:
				Retangulo retangulo = new Retangulo();

				System.out.print("Digite a altura do retângulo: ");
				retangulo.setAltura(sc.nextDouble());
				System.out.print("Digite a base do retângulo: ");
				retangulo.setBase(sc.nextDouble());
				retangulo.calcularArea();
				System.out.println("A área do retângulo: " + retangulo.getArea());
				System.out.println();

				break;
			case 4:
				Circulo circulo = new Circulo();

				System.out.print("Digite o raio do círculo: ");
				circulo.setRaio(sc.nextDouble());
				circulo.calcularArea();
				System.out.println("A área do círculo: " + circulo.getArea());
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
				System.out.println("A área do trapezio: " + trapezio.getArea());
				System.out.println();

				break;
			case 6:
				Paralelogramo paralelogramo = new Paralelogramo();

				System.out.print("Digite a base do paralelogramo: ");
				paralelogramo.setBase(sc.nextDouble());
				System.out.print("Digite a altura do paralelogramo: ");
				paralelogramo.setAltura(sc.nextDouble());
				paralelogramo.calcularArea();
				System.out.println("A área do paralelogramo: " + paralelogramo.getArea());
				System.out.println();

				break;
			case 7:
				System.out.println("Obrigado por usar o sistema de Cálculo de Área");
				break loop;

			default:
				System.out.println("Opcção Inválida!");
				System.out.println();
				break;
			}//swtich
		} while (true);

		sc.close();

	}//main

}//TesteForma
