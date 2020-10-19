package curso_java.condicoes;

import java.util.Scanner;
//import java.util.*;

public class ComparandoInformacoes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String nomeCadastrado = "Diego";

		System.out.print("Escreva seu nome: ");
		String nome = sc.nextLine();

		System.out.println("O nome � identico?");
		if (nomeCadastrado.equals(nome)) {
			System.out.println("Sim");
		} else {
			System.out.println("N�o");
		}

		System.out.println("O nome � igual?");
		if (nomeCadastrado.equalsIgnoreCase(nome)) {
			System.out.println("Sim");
		} else {
			System.out.println("N�o");
		}

//		System.out.println("O nome existe? " + (nomeCadastrado.equalsIgnoreCase(nome)));
//		.equals(arg) compara string e case
//		.equalsIgnoreCase(arg) compara string e ignora case
		sc.close();

	}

}
