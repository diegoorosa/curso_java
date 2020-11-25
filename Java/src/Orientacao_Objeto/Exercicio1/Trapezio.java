package Orientacao_Objeto.Exercicio1;

public class Trapezio extends FormulaGeometrica {

	public void calcularArea() {
		setArea(((getBase() + getBaseMenor()) * getAltura()) / 2);
	}

}
