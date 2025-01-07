package controllers;

import models.Fiscalizador;
import play.mvc.Before;
import play.mvc.Controller;
import play.mvc.With;

public class Logins extends Controller{
	
	public static void form() {
		render();
	}
	
	public static void logar(String username, String senha) {
		String fiscalizadorLogado = Fiscalizador.autenticar(username, senha);
		if (fiscalizadorLogado == null) {
			//USUARIO NAO ENCONTRADO NO BANCO
			flash.error("Credenciais inválidas");
			form();
		} else {
			//SOMENTE USUARIO QUE FORAM ENCONTRADOS NO BANCO
			session.put("fiscalizadorLogado", fiscalizadorLogado);
		Checklists.formulario();
		}
	}
	
	public static void sair() {
		session.clear();
		flash.success("Você saiu do sistema");
		form();
	}

}