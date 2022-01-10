package fundamentos;

public class ConversorTemp {

	public static double converterFahToCel(double fah) {

		// Constants são escritas em maiusculas;
		
		final int SUBINT = 32;
		final double FATOR = 5/9.0;
		
		double fahrenheit = fah;
		double celcius = (fahrenheit - SUBINT) * FATOR;

		return celcius;

	}
		
	public static void main(String[] args) {		 
		
		System.out.println(converterFahToCel(86));
		
	}

}
