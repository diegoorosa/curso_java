package Composicao3Exercicio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		Client client = new Client(name, email, birthDate);
		
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		String status = sc.next();

		Order order = new Order(new Date(), OrderStatus.valueOf(status), client);
		
		System.out.print("How many items to this order: ");
		int n = sc.nextInt();
		
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			String nameProduct = sc.nextLine();
			sc.next();
			System.out.print("Product price: ");
			Double price = sc.nextDouble();
			Product product = new Product(nameProduct, price);
			
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			OrderItem orderItem = new OrderItem(quantity, price, product);
			order.addItem(orderItem);
		}
		
		System.out.println("ORDER SUMMARY:");
		System.out.println("Order moment: " + order.getMoment());
		System.out.println("Order Status: " + order.getStatus());
		System.out.println(client);
		System.out.println("Order items:");
		order.getOrderItem().
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
		
	}

}