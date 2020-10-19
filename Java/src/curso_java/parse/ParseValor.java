package curso_java.parse;

public class ParseValor {

	public static void main(String[] args) {

		System.out.println(Double.parseDouble("10.1") == 10.1); // coverteu uma string para double
		
//		System.out.println(Double.parseDouble("oi") == 1); // gera erro em tempo de execução, tentando converter texto para double
		
		System.out.println(Integer.parseInt("1") == 1); // converteu uma string para int

//		System.out.println(Integer.parseInt("1.1") == 1.1); // gera erro pois converte double para inteiro
		
		System.out.println(String.valueOf(10)); // converteu um numero inteiro para String
		
	}

}
