package br.ufpb.ccae.dce.aps.projeto.gartic;

import br.ufpb.ccae.dce.aps.projeto.gartic.teste.ExcecaoGartic;

public class Jogador {
	
	private String nick;
	private int potuacao;
	private boolean status;
	
	public Jogador(){
		nick= new String();
	}
	
	
	public String getNick() {
		return nick;
	}
	
	public void setNick(String nick) {
		this.nick = nick;
	}
	
	public int getPotuacao() {
		return potuacao;
	}
	
	public void setPotuacao(int potuacao) {
		this.potuacao = potuacao;
	}
	
	public boolean isStatus() {
		return status;
	}
	
	public void setStatus(boolean status) {
		this.status = status;
	}


	public String inserePalavra() {
		// TODO Auto-generated method stub
		return"";
		
	}


	public boolean existeJogador() {
		// TODO Auto-generated method stub
		return true;
	}

	
}
