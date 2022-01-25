package fundamentos;

import java.util.Scanner;

public class ForEach {

	public static void main(String[] args) {

		double media;
		double soma = 0;

		System.out.println("Digite a quantidade de notas: ");
		Scanner scan = new Scanner(System.in);
		int quantidade = scan.nextInt();

		double[] notas = new double[quantidade];

		for (int i = 0; i < notas.length; i++) {

			System.out.println("Digite a nota " + i);
			notas[i] = scan.nextDouble();

		}

		scan.close();

		for (double nota : notas) {
			System.out.println(nota);
			soma += nota;

		}

		media = soma / notas.length;
		System.out.println("Media dos Alunos: " + media);
	}

}
