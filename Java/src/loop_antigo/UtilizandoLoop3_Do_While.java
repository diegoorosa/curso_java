package loop_antigo;

import java.util.Scanner;

public class UtilizandoLoop3_Do_While {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		int idade = 0;
//
//		do {
//			System.out.println("Escreval sua idade: ");
//			idade = Integer.parseInt(sc.nextLine());
//		} while (idade < 18);

		
		String password = "abc123";
		String typed;

		int contador = 1;
		do {
			//contador = contador + 1;
			System.out.print("Digite a sua senha para acessar: ");
			typed = sc.nextLine();			
			if(typed.equals(password)) {
				System.out.println("Acessou o sistema");
			} else if (contador < 3) {
				System.out.println("Senha incorreta!");
				System.out.println("Você tem mais " + (3-contador) + " tentativas");
			} else {
				System.out.println("Acesso bloqueado, tente novamente em 15 minutos");
			}
			contador++;
		} while (!typed.equals(password) && contador <= 3);
		//true && true = true
		//true && false = false
		//false && true = false
		//false && false = false
//			incorreta		
//		1		true & true = true
//		2		true & true = true
//		3		true & false = false terminou loop

//			correta		
//		1		false & true		termina
		
		sc.close();

	}

}
