package curso_java.exercicios;

import java.util.Scanner;

public class Exercicio23_Matriz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor de A: ");
		int A = sc.nextInt();
		System.out.print("Digite o valor de B: ");
		int B = sc.nextInt();
		System.out.print("Digite o valor de C: ");
		int C = sc.nextInt();
		
		double delta = (Math.pow(B,2)) - (4 * A * C);
		System.out.println("Delta = " + delta);
		
		double x1 = ((-B) - Math.sqrt(delta)) / (2 * A);
		double x2 = ((-B) + Math.sqrt(delta)) / (2 * A);
		
		System.out.println("X 1 = " + x1);
		System.out.println("X 2 = " + x2);
		
		
		
		sc.close();
		
		
		

	}// public main
}// public class
