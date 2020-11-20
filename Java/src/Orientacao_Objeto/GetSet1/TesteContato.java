package Orientacao_Objeto.GetSet1;

public class TesteContato {

	public static void main(String[] args) {

		// classe simples
		Contato contato1 = new Contato();
		contato1.setNome("Tyrion");

		// relacionamento tem-um / has-one / HO = Endereço
		Endereco endereco = new Endereco();
		endereco.setNomeRua("Rua dos Tronos");
		endereco.setNumero("999");
		endereco.setComplemento(" - ");
		endereco.setCidade("Kings Landing");
		endereco.setEstado("Westeros");
		endereco.setCep("99999-999");

		contato1.setEndereco(endereco);

		// relacionamento tem-muitos = Telefones

		Telefone telefone1 = new Telefone();
		telefone1.setDdd("19");
		telefone1.setNumero("99987-5432");
		telefone1.setTipo("Celular");

		Telefone telefone2 = new Telefone();
		telefone2.setDdd("19");
		telefone2.setNumero("3334-5432");
		telefone2.setTipo("Casa");

		Telefone[] telefones = new Telefone[2];
		telefones[0] = telefone1;
		telefones[1] = telefone2;

		contato1.setTelefone(telefones);
		
		//Teste Saída do console
		
		if(contato1 != null && contato1.getEndereco() != null) {
			System.out.println(contato1.getEndereco().getNomeRua());
		}
		
		if(contato1 != null && contato1.getTelefone() != null) {
			for(Telefone t : contato1.getTelefone()) {
				System.out.println(t.getNumero());
			}
		}

	}

}
