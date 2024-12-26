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
			c1.nome = "Savero";
			c1.placa = "C100";
			c1.save();
			
			Carro c2 = new Carro();
			c2.nome = "Hillux";
			c2.placa = "C200";
			c2.save();
			
			Carro c3 = new Carro();
			c3.nome = "Audi";
			c3.placa = "C300";
			c3.save();
			
			Fiscalizador f1 = new Fiscalizador();
			f1.nome = "Dionísio";
			f1.save();
			
			Fiscalizador f2 = new Fiscalizador();
			f2.nome = "Angelino";
			f2.save();
			
			Condutor cond1 = new Condutor();
			cond1.nome = "Rodrigo";
			cond1.save();
			
			Condutor cond2 = new Condutor();
			cond2.nome = "Mateus";
			cond2.save();
			
		
		}
	}
	
	
	

}
