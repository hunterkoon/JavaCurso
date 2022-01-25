package fundamentos;

import java.util.Objects;

public class Usuario {

	int id;
	String nome;

	Usuario() {}
	Usuario(String nome) {

		this.nome = nome;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return id == other.id && Objects.equals(nome, other.nome);
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Meu nome � " + nome ;
	}

}
