package curso_java.string;

public class UtilizandoString {

	public static void main(String[] args) {

//		String nome = "Diego";
//		nome = nome + " Schlemper";
//		String sobrenome = "";
//
//		sobrenome = "Rosa";
//
//		System.out.println(nome + " " + sobrenome);
//		//outra maneira
//		System.out.println(nome.concat(" ").concat(sobrenome));

		String nomeCompleto = "Diego Schlemper Rosa";
		int idade = 33;
		int anoAtual = 2020;
		int ano = 1987;

		System.out.println("Meu nome é " + nomeCompleto + " e tenho " + idade + " anos.");
		System.out.println("Meu nome é " + nomeCompleto + " e tenho " + (anoAtual - ano) + " anos.");
		System.out.println(1 + (1 + 1 + (2 + 2)));

	}
}
