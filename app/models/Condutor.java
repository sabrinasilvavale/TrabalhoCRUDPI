package models;

import javax.persistence.Entity;

import play.db.jpa.Model;
@Entity
public class Condutor extends Model {
	public String nome;
	
	
	@Override
	public String toString() {
		return nome;
}
}


