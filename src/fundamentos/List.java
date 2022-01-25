package fundamentos;

import java.util.ArrayList;

public class List {

	public static void main(String[] args) {
		
				
			ArrayList<Usuario> list = new ArrayList<>();
			
			list.add(new Usuario("Carlos"));
			list.add(new Usuario("Lia"));
			list.add(new Usuario("Bia"));
			list.add(new Usuario("Manu"));
			
			
			System.out.println(list.get(2));

			for(Usuario item : list) {				
				System.out.println(item.nome);				
			}			
		
	}
}
