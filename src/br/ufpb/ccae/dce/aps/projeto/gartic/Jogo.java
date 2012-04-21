package br.ufpb.ccae.dce.aps.projeto.gartic;

import java.util.LinkedList;
import java.util.List;

import br.ufpb.ccae.dce.aps.projeto.gartic.teste.ExcecaoGartic;

public class Jogo {

	private List <String> nicks;
	private List <String> tema;
	
	public Jogo(){
		nicks = new LinkedList<String>();
		tema = new LinkedList<String>();
	
	}
	
	public boolean iniciar() {
		// TODO Auto-generated method stub
		return true;
	}
	
	public Jogo getGartic(Jogo novoJogo){
		return novoJogo;
	
    }
	public List getNicks() {
		// TODO Auto-generated method stub
		return null;
	}
	

	public void VerificarNickIgual(String novoNick) throws ExcecaoGartic{
	    for(String a: nicks){
		   if(a==novoNick){
			   throw new ExcecaoGartic("NICK EXISTE");
		   } else {
			   System.out.println(a);
	       }
		}
    }
	
	public boolean criarSala(String tema){
		return true;
	}
   
	
	
	public boolean existeSala(String string, Object object){
		return true;
		 
	 }

	 //randon do jogador da vez e o randon da palavra da partida
	public void escolherJogoDavez() {
		// TODO Auto-generated method stub
		
	}

	public boolean recebeTema() {
		// TODO Auto-generated method stub
		return true;
	}

	public boolean tempoLimite(Object tempoAcabou) {
		// TODO Auto-generated method stub
		return true;
	}

	public boolean jogadorSala(String string, Object object) {
		// TODO Auto-generated method stub
		return true;
	}

	public Object getTemas() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object procuraSala(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	public boolean tempoTotalDoJogo() {
		// TODO Auto-generated method stub
		return true;
	}

	public boolean sairTempoEspirou() {
		// TODO Auto-generated method stub
		return true;
	}
	

}
