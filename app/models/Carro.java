package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class Carro extends Model {
	
	public String nomeCarro;
	public String placaCarro;
	public String anoCarro;
	
}
