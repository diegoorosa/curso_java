package Metodo_Abstrato_Exercicio;

public class LegalPerson extends Person{
	
	private Integer employee;
	
	public LegalPerson() {
		super();
	}

	public LegalPerson(String name, Double incoming, Integer employee) {
		super(name, incoming);
		this.employee = employee;
	}

	public Integer getEmployee() {
		return employee;
	}

	public void setEmployee(Integer employee) {
		this.employee = employee;
	}

	
	@Override
	public double taxes() {
		if (employee > 10) {
			return getIncoming() * 0.14;
		}else {
			return getIncoming() * 0.16;
		}//if else
	}
}
