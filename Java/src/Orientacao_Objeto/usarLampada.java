package Orientacao_Objeto;

import java.util.Scanner;

public class usarLampada {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Lampada encandecente = new Lampada();
		encandecente.acende();
		encandecente.mostrarEstado();

		Lampada fluorescente = new Lampada();
		fluorescente.apaga();
		fluorescente.mostrarEstado();

		encandecente.apaga();
		encandecente.mostrarEstado();
				
		sc.close();
	}
}
