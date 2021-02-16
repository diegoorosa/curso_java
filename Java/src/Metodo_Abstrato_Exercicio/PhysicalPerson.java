package Metodo_Abstrato_Exercicio;

public class PhysicalPerson extends Person {
	
	private Double healthy;
	
	public PhysicalPerson() {
		super();
	}

	public PhysicalPerson(String name, Double incoming, Double healthy) {
		super(name, incoming);
		this.healthy = healthy;
	}

	public Double getHealthy() {
		return healthy;
	}

	public void setHealthy(Double healthy) {
		this.healthy = healthy;
	}

	
	
	@Override
	public double taxes() {
		if (getIncoming() < 20000.0) {
			return (getIncoming() * 0.15) - (getHealthy() * 0.50);
		}else {
			return (getIncoming() * 0.25) - (getHealthy()  * 0.50); 
		}//if else
	}
}
