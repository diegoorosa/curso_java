package Orientacao_Objeto.JogoDaVelha;

import java.util.Scanner;

public class TesteJogoDaVelha {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		JogoDaVelha jogoDaVelha = new JogoDaVelha();

		System.out.println("Jogador 1 = X");
		System.out.println("Jogador 2 = O");

		boolean ganhou = false;
		char sinal;
		int linha = 0;
		int coluna = 0;

		while (!ganhou) {
			if (jogoDaVelha.vezJogador1()) {
				System.out.println("Vez do jogador 1. Escolha linha e coluna (1-3)");
				sinal = 'X';
			} else {
				System.out.println("Vez do jogador 2. Escolha linha e coluna (1-3)");
				sinal = 'O';
			} // if else

			linha = valor("Linha", sc);
			coluna = valor("Coluna", sc);

			if (!jogoDaVelha.validarJogada(linha, coluna, sinal)) {
				System.out.println("Posição ja usada, tente novamente");
			} // if
			jogoDaVelha.imprimirTabuleiro();

			if (jogoDaVelha.verificarGanhador('X')) {
				ganhou = true;
				System.out.println("Parabéns, jogador 1 ganhou!");
			} else if (jogoDaVelha.verificarGanhador('O')) {
				ganhou = true;
				System.out.println("Parabéns, jogador 2 ganhou!");
			} else if (jogoDaVelha.getJogada() > 9) {
				System.out.println("Ninguém ganhou a partida");
			} // if else

		} // while

		sc.close();

	}// main

	static int valor(String tipoValor, Scanner sc) {
		int valor = 0;
		boolean valorValida = false;
		while (!valorValida) {
			System.out.println("Entre com a: " + tipoValor + " (1, 2 ou 3)");
			valor = sc.nextInt();
			if (valor >= 1 && valor <= 3) {
				valorValida = true;
			} else {
				System.out.println("Entrada invalida, tente novamente");
			} // if else

		} // while
		valor--;
		return valor;
	}// valor

}// TesteJogoDaVelha
