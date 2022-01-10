package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);		
		
		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.println("\n\nNome = " + nome);
		
		entrada.close();
		
		
	}
}
