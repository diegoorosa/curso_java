package Orientacao_Objeto.Metodo;

import java.util.Scanner;

public class TesteAluno {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Aluno aluno = new Aluno();
		System.out.println("Entre com o nome do Aluno");
		aluno.nome = sc.next();

		System.out.println("Entre com o nome do curso");
		aluno.nomeCurso = sc.next();

		System.out.println("Entre com a matricula");
		aluno.matricula = sc.next();

		for (int i = 0; i < aluno.nomeDisciplinas.length; i++) {
			System.out.println("Entre com o nome da disciplina: " + i);
			aluno.nomeDisciplinas[i] = sc.next();
		} // for

		for (int i = 0; i < aluno.notasDisciplinas.length; i++) {
			System.out.println("Obtendo notas da discplina: " + aluno.nomeDisciplinas[i]);
			for (int j = 0; j < aluno.notasDisciplinas[i].length; j++) {
				System.out.println("Entre com a nota: " + (j + 1));
				aluno.notasDisciplinas[i][j] = sc.nextDouble();
			} // for
		} // for

		aluno.mostrarInfo();

		for (int i = 0; i < aluno.nomeDisciplinas.length; i++) {
			if (aluno.verificarAprovado(i)) {
				System.out.println("Disciplina: " + aluno.nomeDisciplinas[i] + " - foi aprovado com a média: " + aluno.obterMedia(i));
			} else {
				System.out.println("Disciplina: " + aluno.nomeDisciplinas[i] + " - foi reprovado com a média: " + aluno.obterMedia(i));
			} // if else
		} // for

		
		
		
		
		sc.close();

	}// main

}// testeAluno
