package models;

//Teste de comitagem

import java.util.Date;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class Checklist extends Model{
	public String fiscalizador;
	public String condutor;
	public Date dataSaida;
	public Date dataChegada;
	public String volante;
	public String setas;
	public String marcha;
	public String embreagem;
	public String freios;
	public String acelerador;
	public String buzina;
	
}
