package Orientacao_Objeto;

public class usarCelular {

	public static void main(String[] args) {
		
		Celular iphone = new Celular();
		System.out.println("iPhone");
		iphone.cor = "azul";
		iphone.baterFoto();
		System.out.println(iphone.tecnologia);
		iphone.ligar();
		
		
		System.out.println();
		Celular galaxy = new Celular();
		System.out.println("Galaxy");
		galaxy.peso = 250;
		galaxy.largura = 175;
		galaxy.radio();
		System.out.println(galaxy.tecnologia);
		galaxy.ligar();
		
		
	}

}
