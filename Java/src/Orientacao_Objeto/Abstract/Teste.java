package Orientacao_Objeto.Abstract;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
//		Pessoa pessoa = new Pessoa();
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();
		
//		pessoa.setEndereco("Rua 1, num 1");
		aluno.setEndereco("Rua 2, num 2");		
		professor.setEndereco("Rua 3, num 3");
		
//		System.out.println(pessoa.obterEtiquedaEndereco());
//		System.out.println(aluno.obterEtiquedaEndereco());
//		System.out.println(professor.obterEtiquedaEndereco());
		
		
		aluno.imprimirEtiquetaEndereco();
		System.out.println();
		professor.imprimirEtiquetaEndereco();
		
		
		
		sc.close();

	}// main

}// Teste
