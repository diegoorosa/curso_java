package udemy2Exercicios2;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Account account;

		System.out.print("Enter account numner: ");
		String number = sc.nextLine();
		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();

		System.out.println("Is there an initial deposit (y/n)?");
		char response = sc.next().charAt(0);

		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);
		} else {
			account = new Account(number, holder);
		}

		System.out.println();
		System.out.println("Account data: ");
		System.out.print(account);

		System.out.println();
		System.out.println();
		System.out.print("Enter a deposit value: ");
		account.deposit(sc.nextDouble());
		System.out.println("Updated account data:");
		System.out.println(account);

		System.out.println();
		System.out.print("Enter a withdraw value: ");
		account.withdraw(sc.nextDouble());
		System.out.println("Updated account data:");
		System.out.println(account);

		sc.close();
	}

}
