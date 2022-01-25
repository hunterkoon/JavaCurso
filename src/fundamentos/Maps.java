package fundamentos;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Maps {

	
	public static void main(String[] args) {
		
		Map<Integer , String > usuarios = new HashMap<>();
		
		usuarios.put(1, "Roberto");
		usuarios.put(2, "M�rcio");
		usuarios.put(3, "Jo�o");
		usuarios.put(4, "Hannah");
		
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		System.out.println(usuarios.isEmpty());
		
		
		System.out.println(usuarios.get(1));
		
		// percorre as chaves
		for(int chave : usuarios.keySet()) {			
			System.out.println(chave);
			
		}
		
		// percorre os valores
		for (String chave : usuarios.values()) {
			System.out.println(chave);

		}
		
		// percorre os valores
		for (Entry<Integer , String > entry: usuarios.entrySet()) {
			System.out.println(entry);
			
		}
		
		
	}
}
