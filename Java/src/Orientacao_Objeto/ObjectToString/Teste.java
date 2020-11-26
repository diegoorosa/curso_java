package Orientacao_Objeto.ObjectToString;

public class Teste {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		
		aluno.setCurso("Ciência da Computação Java");
		double[] notas = {10, 9, 8, 7};
		aluno.setNota(notas);
		
		System.out.println(aluno);
		
		String s1 = "string s1";
		String s2 = "string s2";
		
		System.out.println(s1.equals(s2));
		
		Aluno aluno2 = new Aluno();
		aluno2.setCurso("Ciência da Computação Java");
		double[] notas2 = {10, 9, 8, 7};
		aluno2.setNota(notas2);
		
		System.out.println(aluno.equals(aluno2));
		System.out.println(aluno.getNota().equals(aluno.getCurso()));
		

	}// main

}// Teste
