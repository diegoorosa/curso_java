package curso_java.a_Loop;

import java.util.Scanner;

public class While02 {

	public static void main(String[] args) {
		// Fa�a um programa que leia um nome de usu�rio e
		// a sua senha e nao aceite a senha igual ao nome
		// do usuario, mostrando uma mensagem de erro epqp
		// voltando a pedir as infoma�oes

		Scanner sc = new Scanner(System.in);

		boolean verificaCadastro = false;

		do {
			System.out.print("Informe seu nome de usu�rio: ");
			String nome = sc.next();
			System.out.print("Informe uma senha: ");
			String senha = sc.next();

			if (nome.equalsIgnoreCase(senha)) {
				System.out.println("Usu�rio e senha n�o podem ser iguais");
				System.out.println("Tente novamente");
				System.out.println("");
			} else {
				System.out.println("Login criado com sucesso!");
				verificaCadastro = true;
			}

		} while (!verificaCadastro);

		sc.close();

	}

}
