package Orientacao_Objeto.Exercicio1;

public class Circulo extends FormulaGeometrica {

	public void calcularArea() {
		setArea(getPi() * (getRaio() * getRaio()));
	}
}
