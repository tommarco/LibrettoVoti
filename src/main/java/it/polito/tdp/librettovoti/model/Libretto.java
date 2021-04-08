package it.polito.tdp.librettovoti.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Libretto {
	
	private List <Voto> voti;
	
	public Libretto() {
		
		this.voti= new ArrayList<>();
		
		
	}

	public void add(Voto v) {
		
		this.voti.add(v);
		
	}
	public void stampaVotiUguali(int punteggio) {
		
		// IL libretto stampa da solo i voti
		
	}
	/*public String votiUguali(int punteggio) {
		//calcola una stringa che contiene i voti
		//sarà poi il chiamante a stamparli
		//-> Solo il NOME?
		//-> Tutto il voto.toString()
	}*/
	public List <Voto> listavotiUguali(int punteggio){
		
		List <Voto> risultato= new ArrayList<>();
		
		for(Voto v: this.voti) {
			
			if(v.getVoto()==punteggio) {
				risultato.add(v);
			}
			
			
		}
		return risultato;
		//restituisce solo i voti uguali al criterio
		
	}
	
	public Libretto votiUguali(int punteggio) {
		
		Libretto risultato = new Libretto();
		
		
		for(Voto v: this.voti) {
			
			if(v.getVoto()==punteggio) {
				risultato.add(v);
				
			//	risultato.voti.add(v);
			}
			
		}	
		
		return risultato;
	}
	@Override
	public String toString() {
	 String s="";
	 for(Voto v: this.voti) {
		 
		 s= s+ v.toString() +"\n";
		 
	 }
	 return s;
	}

	
	
}
