package controllers;

import models.Condutor;
import models.Fiscalizador;
import play.mvc.Before;
import play.mvc.Controller;

public class Fiscalizadores extends Controller{
	
	@Before
	public static void logar() {
		Logins.logar(null, null);
		
	}

	
	public static void formulario() {
		render();
	}
	public static void salvar(Fiscalizador fiscalizadorObj) {
    	fiscalizadorObj.save();
    	Logins.form();
    	
    
	}
	

}
