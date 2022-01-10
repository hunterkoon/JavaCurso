package fundamentos;

import java.util.Arrays;
import java.util.Scanner;

public class StringToNumber {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite a quantidade de salários: ");

		double[] salariosArray = new double[scan.nextInt()];
		double total = 0;
		double media = 0;



		for (int i = 0 ; i < salariosArray.length ; i++) {

			System.out.print("Digite um Valor: ");
			String entrada = scan.next();
			double number = Double.parseDouble(entrada);
			salariosArray[i] = number;
			
		}
		
		scan.close();

		for (int i = 0; i <  salariosArray.length; i++) {
			total = total + salariosArray[i];
		}

		System.out.println(Arrays.toString(salariosArray));		
		System.out.println(total);

		media = ( total / salariosArray.length );		
		
		System.out.println("A media salarial eh: " + media);

	}
}
