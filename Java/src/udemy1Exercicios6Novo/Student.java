package udemy1Exercicios6Novo;

public class Student {

	public String name;
	public double grade1;
	public double grade2;
	public double grade3;

	public double finalGrade() {
		return grade1 + grade2 + grade3;
	}

	public boolean pass() {
		if (finalGrade() >= 60) {
			System.out.println("PASS");
			return true;
		} else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", (60 - finalGrade()));
			return true;
		}
	}
}
