package Orientacao_Objeto.Final;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Pessoa pessoa = new Pessoa();
//		Pessoa aluno = new Aluno();
//		Pessoa professor = new Professor();
		Aluno aluno = new Aluno();
		Professor professor = new Professor();
		System.out.println(Constantes.REDE_SOCIAL);
		
//		Constantes.REDE_SOCIAL = "123123123123";
		
		System.out.println(Constantes.REDE_SOCIAL);
		
		//em Final deve declarar com letra maiuscula
		final int TOTAL = 1;
		TOTAL = TOTAL +1;
		System.out.println(TOTAL);
		
		sc.close();

	}// main

}// Teste
