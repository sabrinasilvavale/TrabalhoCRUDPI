package controllers;

import models.Fiscalizador;
import play.mvc.Controller;

public class Logins extends Controller{
	
	public static void form() {
		render();
	}
	
	public static void logar(String email, String senha) {
		String FiscalizadorLogado = Fiscalizador.autenticar(email, senha);
		if (FiscalizadorLogado == null) {
			//FUNCIONARIO NAO ENCONTRADO NO BANCO
		flash.error("Credenciais inválidas");	
		form();
		}else {
			//SOMENTE FUNCIONARIOS QUE FORAM ENCONTRADOS NO BANCO
			session.put("FiscalizadorLogado", FiscalizadorLogado);
			Checklists.formulario();
		}
	}
	public static void sair() {
		session.clear();
		flash.success("Você saiu do sistema");
		form();
	}
	}


