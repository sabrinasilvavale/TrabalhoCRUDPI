package models;

import javax.persistence.Entity;

import play.db.jpa.Model;
@Entity
public class Condutor extends Model {
	public String nomeCondutor;
	public String cpfCondutor;
	public String emailCondutor;
	
	

}


