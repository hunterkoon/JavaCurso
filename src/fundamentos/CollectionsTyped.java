package fundamentos;

import java.util.SortedSet;
import java.util.TreeSet;

public class CollectionsTyped {

	public static void main(String[] args) {
		
		//adiciona items na sites de acordo com a ordem de inserção
		//aceita apenas o item tipado
		
		SortedSet<String> lista = new TreeSet<String>();

		lista.add("Ana");
		lista.add("Carlos");
		lista.add("Luca");
		lista.add("Pedro");
		lista.add("Leonardo");
		
		for(String nome : lista) {
			
			System.out.println(nome);
			
		}

	}

}
