package models;

import java.sql.Date;

import play.db.jpa.Model;

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
	
}
