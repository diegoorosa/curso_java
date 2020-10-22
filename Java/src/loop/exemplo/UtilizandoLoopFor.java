package loop.exemplo;

public class UtilizandoLoopFor {
	
	public static void main(String[] args) {
		int quantidadeIteracoes = 3;
		
		//ir� escrever 3 linhas
		System.out.println("Exemplo 1:");
		for(int i = 0/*inicia indice*/; i < quantidadeIteracoes/*se isso for verdadeiro executa o bloco*/; i++/*depois de executar o bloco incrementa o indice*/) {
			System.out.println("Indice: " + i);//escreve de 0 a 2
		}
		System.out.println("----\n");
		
		//ir� escrever 4 linhas ... por causa do operador '<='
		System.out.println("Exemplo 2:");
		for(int i = 0; i <= quantidadeIteracoes; i++) {
			System.out.println("Indice: " + i);//escreve de 0 a 3
		}
		System.out.println("----\n");
		
		//ir� escrever 3 linhas, por causa da condi��o que for�aa a parada do loop
		System.out.println("Exemplo 3:");
		for(int i = 0; i < quantidadeIteracoes; i++) {
			if(i == 1) {
				break;//ir� sair do loop quando entrar nessa condi��o
			}
			System.out.println("Indice: " + i);//escreve 0
		}
		System.out.println("----");
		
		//ir� escrever 2 linhas, por causa da condi��o que for�a pular o restante das coisas do loop
		System.out.println("Exemplo 3:");
		for(int i = 0; i < quantidadeIteracoes; i++) {
			if(i == 1) {
				continue;//ir� sair do loop quando entrar nessa condi��o
			}
			System.out.println("Indice: " + i);//escreve 0 e 2
		}
		System.out.println("----");
	}

}
