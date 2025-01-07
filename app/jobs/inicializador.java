package jobs;

import models.Carro;
import models.Condutor;
import models.Fiscalizador;
import play.jobs.Job;
import play.jobs.OnApplicationStart;

@OnApplicationStart
public class inicializador extends Job{
	
	@Override
	public void doJob() throws Exception{
		if(Carro.count()==0) {
			
			Carro c1 = new Carro();
			c1.nomeCarro = "Savero";
			c1.placaCarro = "C100";
			c1.save();
			
			Carro c2 = new Carro();
			c2.nomeCarro = "Hillux";
			c2.placaCarro = "C200";
			c2.save();
			
			Carro c3 = new Carro();
			c3.nomeCarro = "Audi";
			c3.placaCarro = "C300";
			c3.save();
			
			Fiscalizador f1 = new Fiscalizador();
			f1.nomeFiscalizador = "Dionísio";
			f1.emailFiscalizador = "dionisio@gmail.com";
			f1.login = "dio.nisio";
			f1.senha = "123";
			f1.cpfFiscalizador = "11122233344";
			f1.contatoFiscalizador = "(84]994001122";
			f1.save();
			
			Fiscalizador f2 = new Fiscalizador();
			f2.nomeFiscalizador = "Angelino";
			f2.emailFiscalizador = "angelino@gmail.com";
			f2.login = "ange.lino";
			f2.senha = "456";
			f2.cpfFiscalizador = "05224775888";
			f2.contatoFiscalizador = "(84) 99476-8970";
			f2.save();
			
			Condutor cond1 = new Condutor();
			cond1.nomeCondutor = "Rodrigo";
			cond1.save();
			
			Condutor cond2 = new Condutor();
			cond2.nomeCondutor = "Mateus";
			cond2.save();
			
		
		}
	}
	
	
	

}
