package controllers;

import models.Carro;
import models.Condutor;
import play.mvc.Controller;

public class Carros extends Controller{
	
	public static void formulario() {
		render();
	}
	public static void salvar(Carro carroObj) {
    	carroObj.save();
		
	}
}
