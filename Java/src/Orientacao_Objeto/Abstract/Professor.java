package Orientacao_Objeto.Abstract;

public class Professor extends Pessoa {

	private String nomeCurso;
	private double salario;

	public Professor() {
		super();
	}
	public Professor(String nome, String endereco, String telefone, String nomeCurso) {
		super(nome, endereco, telefone);
		this.nomeCurso = nomeCurso;
	}
	
	
	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double calcularSalarioLiquido() {
		return 0;
	}//calcularSalarioLiquido

	public String obterEtiquetaEndereco() {
		String s = "Endereço do Professor: ";
		s += super.getEndereco();
		return s;
	}//obterEtiquetaEndereco
	
	@Override
	public void imprimirEtiquetaEndereco() {
		System.out.println("Imprimindo endereço do Professor");
		System.out.println(this.obterEtiquetaEndereco());
	}
	
	
}
