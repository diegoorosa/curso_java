package Orientacao_Objeto.ObjectToString;

import java.util.Arrays;

public class Aluno {

	private String curso;
	private double[] nota;

	public Aluno() {
		super();
	}

	public Aluno(String nome, String endereco, String telefone, String curso) {
		//super(nome, endereco, telefone);
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
		//s += super.getEndereco();
		return s;
	}//obterEtiquetaEndereco

	@Override
	public String toString() {
		return "Aluno [curso=" + curso + ", nota=" + Arrays.toString(nota) + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((curso == null) ? 0 : curso.hashCode());
		result = prime * result + Arrays.hashCode(nota);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (curso == null) {
			if (other.curso != null)
				return false;
		} else if (!curso.equals(other.curso))
			return false;
		if (!Arrays.equals(nota, other.nota))
			return false;
		return true;
	}


	
//	@Override
//	public String toString() {
//		return "Aluno [curso= " + curso + ", notas= " + Arrays.toString(nota) + "]"; 
//	}//toString
	
//	public String toString() {
//		String s = curso + "\n";
//		for (double nota: nota) {
//			s += nota + " ";
//		}//for
//		return s;
//	}//toString
//	
	
	
	

		
}
