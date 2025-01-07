package controllers;

import models.Carro;
import models.Condutor;
import play.mvc.Before;
import play.mvc.Controller;
import play.mvc.With;

public class Carros extends Controller{
	
	@Before
	public static void logar() {
		Logins.logar(null, null);
		formulario();
	}
	
	public static void formulario() {
		render();
	}
	public static void salvar(Carro carroObj) {
    	carroObj.save();
    	Logins.form();
		
	}
}
