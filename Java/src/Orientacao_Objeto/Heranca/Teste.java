package Orientacao_Objeto.Heranca;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Aluno aluno = new Aluno();
		Professor professor = new Professor();

		System.out.print("Digite o nome do aluno: ");
		aluno.setNome(sc.next());
		System.out.print("Digite o endereço do aluno: ");
		aluno.setEndereco(sc.next());
		System.out.print("Digite o telefone do aluno: ");
		aluno.setTelefone(sc.next());
		System.out.print("Digite o celular do aluno: ");
		aluno.setTelefoneCelular(sc.next());
		System.out.print("Digite o cpf do aluno: ");
		aluno.setCpf(sc.next());

		System.out.print("Digite o nome do professor: ");
		professor.setNome(sc.next());
		System.out.print("Digite o endereço do professor: ");
		professor.setEndereco(sc.next());
		System.out.print("Digite o telefone do professor: ");
		professor.setTelefone(sc.next());
		System.out.print("Digite o celular do professor: ");
		professor.setTelefoneCelular(sc.next());
		System.out.print("Digite o cpf do professor: ");
		professor.setCpf(sc.next());

		System.out.println();

		System.out.println("Dados do Aluno");
		System.out.println("Nome: " + aluno.getNome());
		System.out.println("CPF: " + aluno.getCpf());
		System.out.println("Endereço: " + aluno.getEndereco());
		System.out.println("Telefone: " + aluno.getTelefone());
		System.out.println("Celular: " + aluno.getTelefoneCelular());
		System.out.println();

		System.out.println("Dados do Professor");
		System.out.println("Nome: " + professor.getNome());
		System.out.println("CPF: " + professor.getCpf());
		System.out.println("Endereço: " + professor.getEndereco());
		System.out.println("Telefone: " + professor.getTelefone());
		System.out.println("Celular: " + professor.getTelefoneCelular());

		sc.close();

	}// main

}// Teste
