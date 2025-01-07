package controllers;

import models.Condutor;
import play.mvc.Before;
import play.mvc.Controller;

public class Condutores extends Controller{
	
	@Before
	public static void logar() {
		Logins.logar(null, null);
		Condutores.formulario();
	}
	
	public static void formulario() {
		render();
	}
    public static void salvar(Condutor condutorObj) {
    	condutorObj.save();
		Logins.form();
	}

}
