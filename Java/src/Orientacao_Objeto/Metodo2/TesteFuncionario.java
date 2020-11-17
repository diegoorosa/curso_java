package Orientacao_Objeto.Metodo2;


public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario();

		funcionario.cadastraFuncionario();

		System.out.println();
		funcionario.mostrarInfo();
		funcionario.obterSalario();

	}

}
