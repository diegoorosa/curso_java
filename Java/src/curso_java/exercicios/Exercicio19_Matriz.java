package curso_java.exercicios;

public class Exercicio19_Matriz {

	public static void main(String[] args) {

		double[][] notasAlunos = new double[30][4];

		// Notas Aluno 1.
		notasAlunos[0][0] = 10;
		notasAlunos[0][1] = 7;
		notasAlunos[0][2] = 9;
		notasAlunos[0][3] = 9.5;

		// Notas Aluno 2.
		notasAlunos[1][0] = 9;
		notasAlunos[1][1] = 8;
		notasAlunos[1][2] = 6;
		notasAlunos[1][3] = 3;

		// Notas Aluno 3.
		notasAlunos[2][0] = 2;
		notasAlunos[2][1] = 5;
		notasAlunos[2][2] = 10;
		notasAlunos[2][3] = 7;

		for (int i = 0; i < notasAlunos.length; i++) {
			System.out.print(" ");

			for (int j = 0; j < notasAlunos[i].length; j++) {
				System.out.print(notasAlunos[i][j] + " - ");

			} // for
			System.out.println(".");
		} // for

		System.out.println("Calculando média de CADA aluno");

		double soma;
		for (int i = 0; i < notasAlunos.length; i++) {
			soma = 0;

			for (int j = 0; j < notasAlunos[i].length; j++) {
				soma += notasAlunos[i][j];

			} // for
			System.out.println("Média do aluno: " + (i + 1) + " é = " + (soma / 4));
		} // for

		double[] notasAluno1 = { 7, 8, 9, 10 };
		double[][] notasAluno2 = { { 7, 8, 9, 10 }, { 9, 6, 7, 10 } };

		System.out.println("Saída da matriz notasAlunos2");

		for (int i = 0; i < notasAluno2.length; i++) {
			for (int j = 0; j < notasAluno2[i].length; j++) {
				System.out.print(notasAluno2[i][j] + " - ");
			} // for
			System.out.println();
		} // for

	}// public static main
}// public class exercicio11
