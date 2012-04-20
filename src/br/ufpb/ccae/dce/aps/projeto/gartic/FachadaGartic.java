package br.ufpb.ccae.dce.aps.projeto.gartic;

import java.util.LinkedList;
import java.util.List;

	public class FachadaGartic {
		
			private  Jogo gartic;
			private  Jogador jogadores;
			private  GerenciadorConexaoRede conectar;
			private  GerenciadorBancoPalavras bd;
			private  Editor paint;
			private  String tema;
			private  FachadaGartic fachada;
			
			// construdor
			public FachadaGartic(){
				this.gartic = new Jogo();
				this.bd = new GerenciadorBancoPalavras();
				this.conectar = new GerenciadorConexaoRede();
				this.jogadores = new Jogador();
				this.paint = new Editor();
			}
			

			public  boolean iniciarJogo(Jogo gartic){ 
				gartic.iniciar();
				conectar.start();
				return true;
			}
			
			public  boolean insereNick(String nome){
				Jogador j = new Jogador();
				j.setNick(nome);
				gartic.VerificarNickIgual(nome);
				return true;
			}
			public void secaoTema(String escolherTema){
				bd.tema(escolherTema);
			}
			
			public boolean initPartida(){
				paint.editor();
				conectar.pesquisarIp();
				conectar.servidor();
				bd.tema(tema);
				bd.palavraAdvinhar();
				return true;
			}
			
	
  		    public boolean insereSala(String string) {
				// TODO Auto-generated method stub
				gartic.existeSala(tema,gartic.getTemas());
				gartic.criarSala(tema);
				return true;
			}
			
			// Redes
			
			// Verificar se esta Online
			
			public boolean verificarRede(){
				this.conectar.pesquisarIp();
				return true;
			}
			
			public boolean conexaoBD(){
				this.conectar.servidor();
				this.conectar.pesquisarIp();
				return true;
			}
			
			public boolean redeConectar(){
				this.conectar.start();
				return true;
			}
			

}

		
		

	

