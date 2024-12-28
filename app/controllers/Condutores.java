package controllers;

import models.Condutor;
import play.mvc.Controller;

public class Condutores extends Controller{
	
	public static void formulario() {
		render();
	}
    public static void salvar(Condutor condutorObj) {
    	condutorObj.save();
		
	}

}
