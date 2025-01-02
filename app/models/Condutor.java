package models;

import javax.persistence.Entity;

import play.db.jpa.Model;


@Entity
public class Condutor extends Model {
	public String nomeCondutor;
	public String emailCondutor;
	public String login;
	public String senha;
	public String cpfCondutor;
	public String contatoCondutor;
	
	public static String autenticar(String login, String senha) {
		Condutor c = Condutor.find("login = ?1 and senha = ?2", login, senha).first();
		if (c == null) {
			return null;
		} else {
			return c.login;
		}
	}
	}




