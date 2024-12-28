package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class Fiscalizador extends Model{
		public String nomeFiscalizador;
		public String emailFiscalizador;
		public String login;
		public String senha;
		public String cpfFiscalizador;
		public String contatoFiscalizador;



public static String autenticar(String login, String senha) {
	Fiscalizador f = Fiscalizador.find("login = ?1 and senha = ?2", login, senha).first();
	if (f == null) {
		return null;
	} else {
		return f.login;
	}
}
}


