package controllers;

import models.Checklist;
import play.mvc.Controller;

public class Checklists extends Controller {
	
	public static void formulario() {
		render();
	}
	
	public static void salvar(Checklist checklistObj) {
		checklistObj.save();
		
		
	}
	
	public static void listagem() {
		
	}
	
	public static void remover() {
		
	}

}
