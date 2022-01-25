package fundamentos;

import java.util.HashSet;
import java.util.Set;

public class Collections {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {

		
		HashSet conjunto = new HashSet();

		
		// nao permite valores repetidos
		// pode ter varios tipos
		// nao cria index
		
		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("Test");
		conjunto.add(1);
		conjunto.add('x');
		
		//size imprime o tamanho do conjunto\

		System.out.println(conjunto.size());

		// remove do conjunto
		conjunto.remove('x');

		System.out.println(conjunto.size());
		System.out.println(conjunto.contains('x'));

		Set nums = new HashSet();

		nums.add(1);
		nums.add(2);
		nums.add(3);

		// adiciona um conjunto a outro.
		conjunto.addAll(nums);

		System.out.println(conjunto);

	}

}
