package aula2;

import java.util.Scanner;

public class ClassePrincipal {
	public static void main(String[] args) {
		System.out.println("hello World!");
		System.out.println("Digite seu nome: ");
		
		int numero;
		String endereço;
		boolean ehVerdade;
		double valorEmReais;
		String nome;
		
		Scanner leitor;
		leitor = new Scanner(System.in);
		
		nome = leitor.nextLine();
		if(nome.equals("Enrico")) {
			System.out.println("Salve");
		} else {
			System.out.println("vaza");
		}
		System.out.println(nome);
		
	}
}
