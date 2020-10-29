package curso_java.a_Loop;

import java.util.Scanner;

public class While03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String nome;
		int idade;
		double salario;
		char sexo;
		char estadoCivil;

		do {
			System.out.print("Nome: ");
			nome = sc.nextLine();
			if (nome.length() > 3) {
				break;
			} else {
				System.out.println("Nome inv�lido! M�nimo de 3 caracteres");
				continue;
			}
		} while (true);

		do {
			System.out.print("Idade: ");
			idade = sc.nextInt();
			if (idade < 0 || idade > 150) {
				System.out.println("Idade inv�lida!");
				continue;
			} else {
				break;
			}
		} while (true);

		do {
			System.out.print("Sal�rio: ");
			salario = sc.nextDouble();
			if (salario <= 0) {
				System.out.println("Sal�rio inv�lido!");
				continue;
			} else {
				break;
			}
		} while (true);

		do {
			System.out.print("Sexo (f/m/o): ");
			sexo = sc.next(".").charAt(0);
			if (sexo != 'm' && sexo != 'f' && sexo != 'o') {
				System.out.println("Sexo inv�lido!");
				continue;
			} else {
				break;
			}
		} while (true);

		do {
			System.out.print("Estado Civil (s/c/v/d): ");
			estadoCivil = sc.next(".").charAt(0);
			if (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd') {
				System.out.println("Estado Civil inv�lido!");
				continue;
			} else {
				break;
			}
		} while (true);

		System.out.println("Cadastro efetuado com sucesso!");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Sal�rio: " + salario);
		System.out.println("Sexo: " + sexo);
		System.out.println("Estado Civil: " + estadoCivil);

		sc.close();

	}

}
