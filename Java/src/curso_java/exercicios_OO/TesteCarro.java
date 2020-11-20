package curso_java.exercicios_OO;

import java.util.Scanner;

public class TesteCarro {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Carro van = new Carro();

		System.out.print("Digite a marca da van: ");
		van.setMarca(sc.next());
		System.out.print("Digite o modelo da van: ");
		van.setModelo(sc.next());
		System.out.print("Digite o numero de passageiros: ");
		van.setNumPassageiros(sc.nextInt());
		System.out.print("Digite a capacidade de combustivel: ");
		van.setCapCombustivel(sc.nextDouble());
		System.out.print("Digite o consumo de combustível: ");
		van.setConsumoCombustivel(sc.nextDouble());

		System.out.println();
		System.out.println("Dados da van");
		System.out.println(van.getMarca());
		System.out.println(van.getModelo());
		System.out.println(van.getNumPassageiros());
		System.out.println(van.getCapCombustivel());
		System.out.println(van.getConsumoCombustivel());

		sc.close();
	}

}
