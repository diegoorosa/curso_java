package loop.exemplo;

public class UtilizandoLoopForeach {
	
	public static void main(String[] args) {
		int[] vetorNumeros = {1, 2, 3};
		//o foreach � utilizado para ver vetores e listas(ser� visto mais para frente)
		//sem a necessidade de utilizar indice ou condi��es
		//vai percorrer todos os itens dos vetores e listas
		//imprime 1, 2 e 3
		System.out.println("Exemplo 1:");
		for(int numeroVetor : vetorNumeros) {
			System.out.println(numeroVetor);
		}
		System.out.println("----\n");
		
		//imprime 1
		System.out.println("Exemplo 2:");
		for(int numeroVetor : vetorNumeros) {
			if(numeroVetor == 2) {
				break;//para o loop
			}
			System.out.println(numeroVetor);
		}
		System.out.println("----\n");
		
		//imprime 1 e 3
		System.out.println("Exemplo 3:");
		for(int numeroVetor : vetorNumeros) {
			if(numeroVetor == 2) {
				continue;//n�o h� condi��o a ser testado no for each
				//portanto s� ignora o c�digo abaixo e vai para o proximo registro
			}
			System.out.println(numeroVetor);
		}
		System.out.println("----\n");
	}

}
