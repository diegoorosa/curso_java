package Orientacao_Objeto.Metodo2;

import java.util.Scanner;

public class Funcionario {

	Scanner sc = new Scanner(System.in);
	String nome;
	String cpf;
	double horasTrabalhadas;
	double valorHora;

	void cadastraFuncionario() {
		System.out.print("Entre com o nome do funcionario: ");
		nome = sc.next();

		System.out.print("Digite o CPF de " + nome + ": ");
		cpf = sc.next();

		System.out.print("Digite a quantidade de horas trabalhadas: ");
		horasTrabalhadas = sc.nextDouble();

		System.out.print("Digite o valor da hora: ");
		valorHora = sc.nextDouble();

	}//cadastraFuncionario

	void mostrarInfo() {
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
	}//mostrarInfo

	void obterSalario() {
		double salario = horasTrabalhadas * valorHora;

		System.out.println("O salario de " + nome + " é: " + salario);
	}//obterSalario

}//Funcionario
