package curso_java.operadores;

import java.util.Scanner;

public class OperadoresLogicos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// && significa E
		System.out.println(1 == 1 && 2 > 1);
		System.out.println(true && true);
		// true && true = true
		// true && false = false
		// false && true = false
		// false && false = false

		// || significa OU
		System.out.println(1 == 2 || 2 == 2);
		System.out.println(false || true);
		// true || true = true
		// true || false = true
		// false || true = true
		// false || false = false

		
//		testeee 123 123 123
		sc.close();

	}

}
