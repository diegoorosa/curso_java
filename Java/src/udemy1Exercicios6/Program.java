package udemy1Exercicios6;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		System.out.print("Name of the student: ");
		student.name = sc.nextLine();
		System.out.print("Firt grade: ");
		student.grade1 = sc.nextDouble();
		System.out.print("Second grade: ");
		student.grade2 = sc.nextDouble();
		System.out.print("Third grade: ");
		student.grade3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f%n", student.finalGrade());
		
		student.pass();

		
		
		
		sc.close();
	}

}
