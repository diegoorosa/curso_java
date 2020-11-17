package Orientacao_Objeto.Metodo;

public class Aluno {

	String nome;
	String matricula;
	String nomeCurso;
	String[] nomeDisciplinas = new String[3];
	double[][] notasDisciplinas = new double[3][4];

	void mostrarInfo() {
		System.out.println("Nome: " + nome);
		System.out.println("Matricula: " + matricula);
		System.out.println("Nome do curso: " + nomeCurso);

		for (int i = 0; i < nomeDisciplinas.length; i++) {
			System.out.println("Notas da disciplica: " + nomeDisciplinas[i]);
			for (int j = 0; j < notasDisciplinas[i].length; j++) {
				System.out.print(notasDisciplinas[i][j] + " ");
			} // for
			System.out.println();
		} // for
	}// mostrarInfo

	boolean verificarAprovado(int indice) {
		if (obterMedia(indice) >= 7) {
			return true;
		} // if
		return false;
	}// verificarAprovado

	double obterMedia(int indice) {
		double soma = 0;

		for (int i = 0; i < notasDisciplinas[indice].length; i++) {
			soma += notasDisciplinas[indice][i];
		} // for
		double media = soma / 4;
		return media;
	}// obterMedia

	
	
}// Aluno
