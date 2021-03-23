package it.polito.tdp.librettovoti.model;

import java.time.LocalDate;

//POJO - Plain Old java Object

//java bean

//Semplice contenitore di dati -- non ha "logica"
/**
 * Memorizza il risutlato di un esame singolo
 * @author l4ffe
 *
 */
public class Voto {
	private String nome;
	private int voto;// 30 L come lo rappresento?
	private LocalDate data;// data superamento esame
	
	/**
	 * Costruttore della classe voto
	 * @param nome del corso superato
	 * @param voto voto ottenuto
	 * @param data data superamento
	 */
	
	public Voto(String nome, int voto, LocalDate data) {
		super();
		this.nome = nome;
		this.voto = voto;
		this.data = data;
	}
	

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


	@Override
	public String toString() {
		return "Esame  " + nome + " superato con " + voto + " il " + data;
	}


	
	
	 

}
