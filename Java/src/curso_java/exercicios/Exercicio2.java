package curso_java.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// O aluno tem estatus aprovado no 1º semestre
		// Leia o nome do aluno
		// Leia 2 valores de ponto flutuante de dupla precisão, que correspondem a
		// 2 notas de um aluno para o 2º semestre. A seguir, calcule a média do aluno,
		// se o aluno tirar
		// nota igual ou maior que 7
		// exiba e mensagem de aprovado, se a media for menor exiba a mensagem
		// reprovado.
		// Compare se o aluno foi aprovado nos dois semestres, caso seja exiba a
		// mensagem "PARABENS"
		// caso o aluno tenha o segundo semestre diferente do primeiro, exiba a
		// mensagem, "estude mais"
		// Faça dois if, um para verificar se foi aprovado, e outro para verificar se
		// vai exibir a mensagem Parabens
		// ou Estude mais

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String primeiroSemestre = "Aprovado";

		System.out.print("Digite o nome do Aluno: ");
		String nome = sc.nextLine();

		System.out.print("Digite a primeira nota do aluno: ");
		float nota1 = sc.nextFloat();
		System.out.print("Digite a segunda nota do aluno: ");
		float nota2 = sc.nextFloat();

		float media = (nota1 + nota2) / 2;

		String status = "";

		if (media >= 7) {
			status = "Aprovado";
			System.out.printf("%s foi aprovado com a média %.2f%n", nome, media);
		} else if (media >= 5 && media <= 6.9) {
			status = "Recuperação";
			System.out.printf("%s está de recuperação com a média %.2f%n", nome, media);
		} else {
			status = "Reprovado";
			System.out.printf("%s foi reprovado com a média %.2f%n", nome, media);
		}

		if (primeiroSemestre.equals(status)) {
			System.out.printf("Parabéns %s !!! Você foi aprovado no primeiro e no segundo semestre", nome);
		} else if (status == "Recuperação") {
			System.out.printf("Estude mais %s, você está de recuperação no segundo semestre", nome);
		} else {
			System.out.printf("Estude mais %s, você foi reprovado no segundo semestre", nome);
		}

		sc.close();
	}

}
