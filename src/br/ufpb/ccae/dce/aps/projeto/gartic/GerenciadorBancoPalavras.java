package br.ufpb.ccae.dce.aps.projeto.gartic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import br.ufpb.ccae.dce.aps.projeto.gartic.teste.ExcecaoGartic;

public class GerenciadorBancoPalavras {
	
	 List <String> palavra ;
	public GerenciadorBancoPalavras (){
		this.palavra = new ArrayList<String>();
	}
	
	public void tema(String tema){
	
	}

	public boolean palavraAdvinhar() {
		return true;
		// TODO Auto-generated method stub
		
	}

	public Object tempoAcabou() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean gerarPalavra() {
		// TODO Auto-generated method stub
		return true;
	}

	// procura palavra impropria.
	public void procuraPalavra(String string){
		  
		for(String imp: palavra){
			   if(imp.equals(palavra)){
				   throw new ExcecaoGartic("Palavra impropria");
			   } else {
				   System.out.println(palavra);
		       }
			}
		
	}
	
}
