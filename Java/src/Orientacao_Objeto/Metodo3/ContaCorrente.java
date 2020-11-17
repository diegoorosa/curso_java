package Orientacao_Objeto.Metodo3;

import java.util.Scanner;

public class ContaCorrente {

	Scanner sc = new Scanner(System.in);

	String agencia;
	String conta;
	int limiteSaque;
	int saldo;
	String eVip;
	boolean vip;

	void cadastrarConta() {
		System.out.print("Digite o numero da Conta: ");
		conta = sc.next();
		System.out.print("Digite a agencia: ");
		agencia = sc.next();
		System.out.print("Digite o limite de saque: ");
		limiteSaque = sc.nextInt();
		System.out.print("Digite o saldo da Conta: ");
		saldo = sc.nextInt();
		System.out.println("Cliente é VIP? (S/N)");
		eVip = sc.next();
		if (eVip.equalsIgnoreCase("S")) {
			vip = true;
		} else {
			vip = false;
		} // if else
	}// cadastrarConta

	void deposito() {
		System.out.println("Digite o valor que quer depositar");
		int deposito = sc.nextInt();
		saldo += deposito;
		System.out.println("Saldo atual: " + saldo);
	}// deposito

	void saque() {
		System.out.print("Quanto deseja sacar: ");
		int saque = sc.nextInt();
		if (saque <= limiteSaque) {
			saldo -= saque;
			System.out.println("Saldo atual: " + saldo);
		} else {
			System.out.println("Limite de saque insuficiente");
		} // if else
		 
	}// saque

	void consultaSaldo() {
		System.out.println("O saldo da conta: " + saldo);
	}// consultaSaldo

	void aumentarLimite() {
		if (vip) {
			System.out.print("Quanto deseja aumentar de limite: ");
			limiteSaque += sc.nextInt();
			System.out.println("Limite de Saque atual: " + limiteSaque);
		} else {
			System.out.println("Usuário não é VIP");
		} // if else
	}// aumentarLimite

}
