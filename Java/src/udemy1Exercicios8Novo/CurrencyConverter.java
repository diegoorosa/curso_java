package udemy1Exercicios8Novo;

public class CurrencyConverter {

	public static double dollar;
	public static double quantity;
	public static double iof = 6;
	
	public static double finalPrice() {
		return (dollar * quantity) + (dollar * quantity) * (iof / 100);
	}
	
	
}
