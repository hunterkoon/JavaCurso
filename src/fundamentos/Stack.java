package fundamentos;

import java.util.ArrayDeque;
import java.util.Deque;

public class Stack {

	public static void main(String[] args) {
		// declara objeto de stack
		Deque<String> livros = new ArrayDeque<String>();

		//adiciona elementos
		livros.add("O Hobbit");
		livros.add("O senhor dos an�is");
		livros.add("Harry Potter");
		livros.add("1984");
		livros.add("A Guerra dos tronos");
		livros.add("R�pido e devagar");
		
		//for para remo��o dos livros
		for (String livro : livros) {
			livros.poll();
			System.out.println(livro + " foi removido");

		}

		System.out.println(livros.size());

	}

}
