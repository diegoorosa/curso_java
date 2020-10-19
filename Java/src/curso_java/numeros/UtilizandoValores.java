package curso_java.numeros;

public class UtilizandoValores {

	public static void main(String[] args) {

//		System.out.println(1 + 1); //soma
//		System.out.println(2 - 1); //subtração 
//		System.out.println(2 * 1); //multiplicação
//		System.out.println(2 / 2); //divisão
//		System.out.println(4 % 2); //mod (resto da divisão)

		int valorUm = 1;
		int valorDois = 2;
		int valorQuatro = 4;

		int primeiroResultado = valorUm + valorUm;
		System.out.println(primeiroResultado);

		int segundoResultado = valorDois - valorUm;
		System.out.println(segundoResultado);

		int terceiroResultado = valorDois * valorUm;
		System.out.println(terceiroResultado);

		int quartoResultado = valorDois / valorDois;
		System.out.println(quartoResultado);

		int quintoResultado = valorQuatro % valorDois;
		System.out.println(quintoResultado);

		int sextoResultado = (int) Math.pow(valorQuatro, valorDois);
		System.out.println(sextoResultado);

		// long - numeros inteiros só que maiores
		// double - numeros decimais
		// Double - numeros decimais com funções de auxilio (o que gera menor
		// desempenho)
		// flaot - numeros decimais só que maiores
		// Float - numeros decimais só que maiores (funções que auxiliam ao montar o
		// sistema, porém da menor desempenho)

		long id = 10000000000000L;
		double nota = 9.5;
		Double nota2 = 9.5;
		float peso = 80.7f;
		Float peso2 = 80.7f;

		System.out.println(nota2.toString());
		System.out.println(id);
		System.out.println(nota);
		System.out.println(peso);
		System.out.println(peso2);

	}

}
