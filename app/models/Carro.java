package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class Carro extends Model {
	
	public String nome;
	public String placa;
	
	@Override
	public String toString() {
		return nome + " (" + placa + ")";
		
	}
	
	
	

}
