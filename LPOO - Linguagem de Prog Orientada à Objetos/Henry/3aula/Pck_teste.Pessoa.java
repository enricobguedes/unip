package Pck_teste

import Pck_teste.Pessoa;

public class Aluno extends Pessoa {
	private char[] ra;
	public void setRa(char[] ra) {
		this.ra= ra;
	}
}

public class main() {
	System.out.println("O ra é:" + ra);
}


/* 

NOTAR: Este Ã© filho do Objeto Pessoa 
por isso extends Pessoa. 

Adiciona Ra ao objeto Pessoa de maneira
privata a este pck.