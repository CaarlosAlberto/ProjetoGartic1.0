package br.ufpb.ccae.dce.aps.projeto.gartic;

import java.util.*;

public class Sala {

	private String tema;
	private Map <String,Jogador> listaJogadores;
	
	public Sala(String tema){
		listaJogadores = new HashMap<String,Jogador>();
	}
	
	public Map<String, Jogador> getListaJogadores() {
		return listaJogadores;
	}

	public void setListaJogadores(Map<String, Jogador> listaJogadores) {
		this.listaJogadores = listaJogadores;
	}

	public String getTema(){
		return tema;
	}
	
	public void setTema(String tema){
		this.tema = tema;
	}
	
	public void adicionarJogadores(String tema, Jogador jogador){
		listaJogadores.put(tema, jogador);
	}
	
}