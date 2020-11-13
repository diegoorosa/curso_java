package Orientacao_Objeto;

public class Celular {

	String cor = "preto";
	float peso = 200;
	float altura = 150;
	double largura = 75;
	String tecnologia;
	String estadoDoCelular;

	public void ligar() {
		estadoDoCelular = "ligado";
		System.out.println("Cor: " + cor);
		System.out.println("Peso: " + peso);
		System.out.println("Altura: " + altura);
		System.out.println("Lagura: " + largura);
	}

	public void desligar() {
		estadoDoCelular = "desligado";
	}

	public void radio() {
		tecnologia = "Ouvindo radio";
	}

	public void baterFoto() {
		tecnologia = "Bateu Foto";
	}

}
