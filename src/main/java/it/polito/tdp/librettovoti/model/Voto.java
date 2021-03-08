package it.polito.tdp.librettovoti.model;

import java.time.LocalDate;


//POJO- Plain Old java Object
//java Bean
//semplice contenitore di dati -- non ha logica

/**
 * Memorizza il risultato di un esame singolo
 * @author l4ffe
 *
 */

public class Voto {
	private String nome;
	private int voto;// 30 L come lo rappresento
	private LocalDate data; //data superamento
	
	
	public Voto(String nome, int voto, LocalDate data) {
		super();
		this.nome = nome;
		this.voto = voto;
		this.data = data;
	}
	
	/**
	 * Costruttore della classse voto
	 * @param nome Nome del corso superato
	 * @param
	 */


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getVoto() {
		return voto;
	}


	public void setVoto(int voto) {
		this.voto = voto;
	}


	public LocalDate getData() {
		return data;
	}


	public void setData(LocalDate data) {
		this.data = data;
	}
	
	
	

	
	
}
