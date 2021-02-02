package udemy2Exercicios2;


public class Account {

	private String number;
	private String holder;
	private double balance;

	public Account(String number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	
	public Account(String number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}

	public String getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}
		
	@Override
	public String toString() {
		return "Account " + number + ", Holder: " + holder + ", Balance: $ " + String.format("%.2f", balance);
	}

	public void accountNumber(String number) {
		this.number = number; 
	}
	
	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		balance -= amount + 5;
	}
	

}
