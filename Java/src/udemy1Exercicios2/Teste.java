package udemy1Exercicios2;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Triangule x = new Triangule();
		Triangule y = new Triangule();

		System.out.println("Enter the measures of triangule X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Enter the measures of triangule Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double areaX = x.area();
		double areaY = y.area();

		System.out.printf("Triangule X area: %.4f%n", areaX);
		System.out.printf("Triangule Y area: %.4f%n", areaY);

		if (areaX > areaY) {
			System.out.println("Larger triangule X");
		} else {
			System.out.println("Larger triangule Y");
		}

		sc.close();

	}

}
