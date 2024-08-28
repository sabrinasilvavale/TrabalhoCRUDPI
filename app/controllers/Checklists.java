package controllers;

import java.util.Collections;
import java.util.Date;
import java.util.List;

import models.Checklist;
import models.ExcluidoStatus;
import play.mvc.Controller;

public class Checklists extends Controller {

	public static void formulario() {
		render();
	}

	public static void salvar(Checklist checklistObj) {
		checklistObj.exclusaoLogica = ExcluidoStatus.ATIVADO;
		checklistObj.dataChecklist = new Date();
		checklistObj.save();
		listagem(null);

	}

	public static void listagem(String termo) {
		List<Checklist> checkListObj = Collections.EMPTY_LIST;
		if (termo == null) {
			checkListObj = Checklist.find("exclusaoLogica = ?1 ", ExcluidoStatus.ATIVADO).fetch();
		} else {
			checkListObj = Checklist.find("lower(fiscalizador) like ?1 AND exclusaoLogica = ?2", "%" + termo.toLowerCase() + "%", ExcluidoStatus.ATIVADO).fetch();
		}
		render(checkListObj, termo);

	}

	public static void remover(Long id) {
		Checklist checklistRemoveObj = Checklist.findById(id);
		checklistRemoveObj.exclusaoLogica = ExcluidoStatus.DESATIVADO;
		checklistRemoveObj.save();
 		listagem(null);
	}
	
	public static void editar(Long id) {
		Checklist checklistEditarObj = Checklist.findById(id);
		renderTemplate("Checklists/formulario.html", checklistEditarObj);
		
		
	}

}
