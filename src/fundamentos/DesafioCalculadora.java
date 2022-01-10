package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Entre com o primeiro Valor: ");
		double inputOne = scan.nextDouble();
		System.out.print("Entre com o segundo Valor: ");
		double inputTwo = scan.nextDouble();
		System.out.print("Entre com o Operando EX: * , / , + , - : ");
		String operando = scan.next();
		scan.close();

		double resultado;

		resultado = operando.equals("+") ? inputOne + inputTwo
				: operando.equals("-")? inputOne - inputTwo
						: operando.equals("*") ? inputOne * inputTwo
								: operando.equals("/") ? inputOne / inputTwo : 0;
				
		System.out.printf("%.2f %s %.2f = %.2f" , inputOne, operando, inputTwo, resultado);

	}

}
