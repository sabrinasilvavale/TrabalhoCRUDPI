package controllers;

import java.util.Collections;
import java.util.List;

import models.Checklist;

import play.mvc.Controller;

public class Checklists extends Controller {

	public static void formulario() {
		render();
	}

	public static void salvar(Checklist checklistObj) {
		checklistObj.save();
		listagem(null);

	}

	public static void listagem(String termo) {
		List<Checklist> checkListObj = Collections.EMPTY_LIST;
		if (termo == null) {
			checkListObj = Checklist.findAll();
		} else {
			checkListObj = Checklist.find("lower(fiscalizador) like ?1", "%" + termo.toLowerCase() + "%").fetch();
		}
		render(checkListObj, termo);

	}

	public static void remover(Long id) {
		Checklist checklistRemoveObj = Checklist.findById(id);
		checklistRemoveObj.delete();
		listagem(null);
	}
	
	public static void editar(Long id) {
		Checklist checklistEditarObj = Checklist.findById(id);
		renderTemplate("Checklists/formulario.html", checklistEditarObj);
		
		
	}

}
