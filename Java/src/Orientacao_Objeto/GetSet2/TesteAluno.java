package Orientacao_Objeto.GetSet2;

import java.util.Scanner;

public class TesteAluno {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Aluno aluno = new Aluno();

		System.out.print("Entre com o nome do aluno: ");
		aluno.setNome(sc.next());

		System.out.print("Entre com o nome do curso: ");
		aluno.setNomeCurso(sc.next());

		System.out.print("Entre com a Matricula: ");
		aluno.setMatricula(sc.next());

		for (int i = 0; i < aluno.getNomeDisciplinas().length; i++) {
			System.out.println("Entre com o nome da disciplina: " + (i + 1));
			aluno.setNomeDisciplinaPos(i, sc.next());

		} // for

		for (int i = 0; i < aluno.getNotasDisciplinas().length; i++) {
			System.out.println("Obtendo notas da disciplina: " + aluno.getNomeDisciplinas()[i]);
			for (int j = 0; j < aluno.getNotasDisciplinas()[i].length; j++) {
				System.out.println("Entre com a nota: " + (j + 1));
				aluno.setNotaPosIJ(i, j, sc.nextDouble());
			} // for
		} // for

		aluno.mostrarInfo();

		for (int i = 0; i < aluno.getNomeDisciplinas().length; i++) {
			if (aluno.verificarAprovado(i)) {
				System.out.println("Disciplina: " + aluno.getNomeDisciplinas()[i] + " - foi aprovado");
			} else {
				System.out.println("Disciplina: " + aluno.getNomeDisciplinas()[i] + " - foi reprovado");
			} // if else
		} // for

		sc.close();

	}

}
