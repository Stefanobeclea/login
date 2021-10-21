package it.prova.web.model;

public class Persona {
	private String nome;
	private String cognome;
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}

	public Persona(String nome, String cognome) {
		super();
		this.nome = nome;
		this.cognome = cognome;
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	
}
