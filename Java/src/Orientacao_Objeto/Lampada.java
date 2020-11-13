package Orientacao_Objeto;

public class Lampada {
	String estadoDaLampada;

	public void acende() {
		estadoDaLampada = "aceso";
	}

	public void apaga() {
		estadoDaLampada = "apagado";
	}

	public void mostrarEstado() {
		System.out.println(estadoDaLampada);
	}
}