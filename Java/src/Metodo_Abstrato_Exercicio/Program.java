package Metodo_Abstrato_Exercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Person> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double incoming = sc.nextDouble();

			if (ch == 'i') {
				System.out.print("Health expenditures: ");
				double healthy = sc.nextDouble();
				list.add(new PhysicalPerson(name, incoming, healthy));
			} else {
				System.out.print("Number of employees: ");
				int employees = sc.nextInt();
				list.add(new LegalPerson(name, incoming, employees));
			} // if else
		} // for

		double sum = 0.0;
		System.out.println();
		System.out.println("TAXES PAID:");
		for (Person p : list) {
			System.out.println(p.getName() + ": $ " + String.format("%.2f", p.taxes()));
			sum += p.taxes();
		}//for
		
		System.out.println();
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
		
		sc.close();
	}

}
