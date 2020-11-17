package Orientacao_Objeto.Metodo4;

import java.util.Scanner;

public class Mercado {
	Scanner sc = new Scanner(System.in);

	double fileDuplo;
	double alcatra;
	double picanha;
	boolean cartao;
	int carne;
	double desconto;
	double total;

	void tipoDeCarne() {
		System.out.println("Qual tipo de carne você deseja?");
		System.out.println("1 - File Duplo");
		System.out.println("2 - Alcatra");
		System.out.println("3 - Picanha");
		carne = sc.nextInt();
		if (carne == 1) {
			System.out.print("Quantos kilos de Filé Duplo: ");
			fileDuplo = sc.nextDouble();
		} else if (carne == 2) {
			System.out.print("Quantos kilos de Alcatra: ");
			alcatra = sc.nextDouble();
		} else {
			System.out.print("Quantos kilos de Picanha: ");
			picanha = sc.nextDouble();
		} // if else else
	}// tipoDeCarne

	void cupomFiscal() {
		if (carne == 1) {
			System.out.println("Filé Duplo: " + fileDuplo + "kg");
		} else if (carne == 2) {
			System.out.println("Alcatra: " + alcatra + "kg");
		} else {
			System.out.println("Picanha: " + picanha + "kg");
		} // if else else

		precoTotal();
		eCartao();
		desconto();
		totalPagar();
				

	}// cupomFiscal

	void precoTotal() {
		if (fileDuplo >= 5) {
			total = fileDuplo * 5.8; 
			System.out.println("Preço total: " + total);
		} else if (fileDuplo < 5 && fileDuplo > 0) {
			total = fileDuplo * 4.9; 
			System.out.println("Preço total: " + total);
		} // if else
		if (alcatra >= 5) {
			total = alcatra * 6.8; 
			System.out.println("Preço total: " + total);
		} else if (alcatra < 5 && alcatra > 0) {
			total = alcatra * 5.9; 
			System.out.println("Preço total: " + total);
		} // if else
		if (picanha >= 5) {
			total = picanha * 7.8; 
			System.out.println("Preço total: " + total);
		} else if (picanha < 5 && picanha > 0) {
			total = picanha * 6.9;
			System.out.println("Preço total: " + total);
		} // if else
	}// precoTotal
	
	void eCartao() {
		System.out.println("1 - Cartão");
		System.out.println("2 - Dinheiro");
		int menu = sc.nextInt();
		if (menu == 1) {
			cartao = true;
		}else {
			cartao = false;
		}//if else
	}//eCartao
	
	void desconto() {
		if (cartao) {
			desconto = (total * 0.05);
			System.out.printf("Desconto: %.2f\n", desconto);
		}//if
	}//desconto
	
	void totalPagar() {
		total -= desconto;
		System.out.println("Total a pagar: " + total);
	}
	
	
	
	
}// Mercado
