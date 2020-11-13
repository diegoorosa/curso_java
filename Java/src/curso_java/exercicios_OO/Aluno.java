package curso_java.exercicios_OO;

import java.util.Scanner;

public class Aluno {

	Scanner sc = new Scanner(System.in);

	String nome;
	String matricula;
	double nota;
	double media;

	public void calcularMedia() {

		System.out.print("Qual o nome do Aluno: ");
		nome = sc.nextLine();
		System.out.println("Qual o codigo de matrícula de " + nome + "?");
		matricula = sc.nextLine();
		
		for (int i = 1; i <= 4; i++) {
			System.out.print("Digite a nota " + i + " de " + nome + " : ");
			nota = sc.nextDouble();
			media += nota;

		}

		media = media / 4;
		System.out.println("A média do aluno " + nome + " é = " + media);

	}
	
	public void matricula() {
		System.out.println("A matricula de " + nome + " é: " + matricula);
		
	}
	

}
