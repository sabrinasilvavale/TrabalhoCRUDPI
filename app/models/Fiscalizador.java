package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class Fiscalizador extends Model{
		public String nome;
		public String email;
		
		public String login;
		public String senha;

	
		
		@Override
		public String toString() {
			return nome;
}
	


public static String autenticar(String login, String senha) {
	Fiscalizador f = Fiscalizador.find("login = ?1 and senha = ?2", login, senha).first();
	if (f == null) {
		return null;
	} else {
		return f.login;
	}
}
}


