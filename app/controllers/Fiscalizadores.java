package controllers;

import models.Condutor;
import models.Fiscalizador;
import play.mvc.Controller;

public class Fiscalizadores extends Controller{
	
	public static void formulario() {
		render();
	}
	public static void salvar(Fiscalizador fiscalizadorObj) {
    	fiscalizadorObj.save();
		
	}
	

}
