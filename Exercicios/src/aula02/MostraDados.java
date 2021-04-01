package aula02;

import java.util.Scanner;

public class MostraDados {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite seu nome: ");
		String nome = sc.nextLine();
		
		System.out.print("digite seu telefone: ");
		String telefone = sc.nextLine();
		
		System.out.print("digite seu email: ");
		String email = sc.nextLine();
		
		System.out.println(nome +" - " + telefone + " - " + email);
		
		
		

	}

}
