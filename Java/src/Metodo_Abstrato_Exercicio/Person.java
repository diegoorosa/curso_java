package Metodo_Abstrato_Exercicio;

public abstract class Person {

	private String name;
	private Double incoming;

	public Person() {
	}

	public Person(String name, Double incoming) {
		this.name = name;
		this.incoming = incoming;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getIncoming() {
		return incoming;
	}

	public void setIncoming(Double incoming) {
		this.incoming = incoming;
	}
	
	public abstract double taxes();
	
}
