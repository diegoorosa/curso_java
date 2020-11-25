package Orientacao_Objeto.Heranca;

public class Aluno extends Pessoa {

	private String curso;
	private double[] nota;

	public Aluno() {
		super();
	}

	public Aluno(String nome, String endereco, String telefone, String curso) {
		super(nome, endereco, telefone);
		this.curso = curso;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public double[] getNota() {
		return nota;
	}

	public void setNota(double[] nota) {
		this.nota = nota;
	}

	public double calcularMedia() {
		return 0;
	}// calcularMedia

	public boolean verificarAprovado() {
		return true;
	}// verificarAprovado

	public String obterEtiquetaEndereco() {

		String s = "Endereço do Aluno: ";
		s += super.getEndereco();
		return s;
	}//obterEtiquetaEndereco

}
