package Pck_teste

import Pck_teste.Aluno
import Pck_teste.Professor;

public class Pessoa {

	private String nome;
	private String endereco;
	private char[] telefone;

	public String getNome() {
		return nome;
	}

	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public char[] getTelefone() {
		return telefone;
	}
	public void setTelefone(char[] telefone) {
		this.telefone = telefone;
	}
}

/* 

NOTAR: Este pck e a mae de todos
os filhos. Todos que forem referi-
dos à ela, terao estes atributos 
incubidos a eles.

*/ 