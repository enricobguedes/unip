package heranca;

import heranca.Pessoa;
import heranca.Extensao;

public class Estudos {

	public static void main (String args[]) {
		Pessoa pessoa = new Pessoa();
		pessoa.nome = "Enrico";
		pessoa.endereco = "Rua assa";
		pessoa.telefone =  "3012-9021";
		
		System.out.println("Nome: " + pessoa.nome + "\n" + 
							"Endereço: " + pessoa.endereco + "\n"+ 
							"Telefone: " + pessoa.telefone + "\n" );
		
	}
}