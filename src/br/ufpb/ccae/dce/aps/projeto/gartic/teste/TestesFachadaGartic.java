package br.ufpb.ccae.dce.aps.projeto.gartic.teste;

import static org.junit.Assert.*;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import br.ufpb.ccae.dce.aps.projeto.gartic.FachadaGartic;
import br.ufpb.ccae.dce.aps.projeto.gartic.GerenciadorBancoPalavras;
import br.ufpb.ccae.dce.aps.projeto.gartic.GerenciadorConexaoRede;
import br.ufpb.ccae.dce.aps.projeto.gartic.Jogador;
import br.ufpb.ccae.dce.aps.projeto.gartic.Jogo;
import br.ufpb.ccae.dce.aps.projeto.gartic.GUI.FachadaGUI;

public class TestesFachadaGartic {

	private Jogo novoJogo;
	private Jogador jogador;
	private FachadaGartic fachada;
	private GerenciadorBancoPalavras tema;
	private FachadaGUI fGUI;
	private GerenciadorConexaoRede conectar;
	
	@Before
	public  void setUp(){
		novoJogo = new  Jogo();
		jogador = new Jogador();
		fachada = new FachadaGartic();
		tema = new GerenciadorBancoPalavras();
		fGUI = new FachadaGUI();
		conectar = new  GerenciadorConexaoRede();
		
	}

	// testa a conex�o
    @Test 
	public void testInitConexaoRede() {
    	
    	Assert.assertTrue(fachada.verificarRede());
    	fachada.redeConectar();
	} 
    
    // Testa se o jogo foi iniciado
    
     @Test 
    public void testInitJogo() {
    	fachada.redeConectar();
    	Assert.assertTrue(novoJogo.iniciar());
    } 
    
    // teste se o nick fornecido j� existe
	@Test (expected=ExcecaoGartic.class)
	public void testNick() throws ExcecaoGartic {
		    novoJogo.iniciar();
		    fachada.conexaoBD();
		    fachada.insereNick("Carlos");  
	}
   
	// teste insire sala e existe uma sala 
	@Test 
	public void testSala() {
		fachada.redeConectar();
    	Assert.assertTrue(novoJogo.iniciar());
		fachada.conexaoBD();
	        Assert.assertTrue(fachada.insereNick("Carlos"));
	        novoJogo.VerificarNickIgual("Carlos");
		novoJogo.criarSala(" Animal");
		Assert.assertTrue(novoJogo.existeSala("Animal"," "));
	}

	@Test
	public void entrouNaSala(){
		Assert.assertTrue(novoJogo.existeSala("Animais", novoJogo.getTemas()));
		Assert.assertTrue(novoJogo.jogadorSala("Carlos",novoJogo.procuraSala("Animais")));
	}
	
	@Test
	public void sairDaSala(){
		novoJogo.existeSala("Animais", novoJogo.getTemas());
		novoJogo.jogadorSala("Carlos",novoJogo.procuraSala("Animais"));
	}
	
	@Test 
	public void salaCheia(){
		Assert.assertEquals(jogador.existeJogador(),true);
	}
	
	//Iniciar partida.
	@Test 
	public void testInitPartida()  {
	fachada.iniciarJogo(novoJogo);
	fachada.insereNick("Carlos");
	fachada.secaoTema("Animal");
	Assert.assertTrue(fachada.initPartida());
	novoJogo.escolherJogoDavez();
		        }
	
	@Test
          public void proximaRodada(){
	 	 jogador.setPotuacao(125);
	  	 jogador.proximaRodada();
   }
	
	
	// teste de banco de palavra
	@Test
	public void testInitConexaoBD(){
		Assert.assertTrue(tema.gerarPalavra());
		novoJogo.iniciar();
	}
	
	@Test
	public void testTentativa(){
		jogador.inserePalavra();
		jogador.inserePalavra();
	}
	
	
	@Test (expected=ExcecaoGartic.class)
	public void Palavrabloqueada() throws ExcecaoGartic{
		jogador.InseriPalavraAdivinhar(tema);
	}
	
	@Test 
	public void testTempo(){
	    jogador.setNick("Carlos");
	    novoJogo.VerificarNickIgual("Carlos");
	    novoJogo.criarSala("Alimento");
	    Assert.assertTrue(novoJogo.existeSala( "Alimento","Animal"));
	    Assert.assertTrue(jogador.existeJogador());
	    Assert.assertTrue(novoJogo.recebeTema());
	    Assert.assertTrue(novoJogo.tempoLimite(tema.tempoAcabou()));
	 }
	 
	 @Test
	public void inatividadeJogodor(){
		novoJogo.tempoTotalDoJogo();
		novoJogo.sairTempoEspirou();
	}
	
	@Test
        public void testInitEditor() {
            Assert.assertFalse(fGUI.initEditor());
         }
    
	@Test (expected=ExcecaoGartic.class)
	public void testPImproprias() throws ExcecaoGartic{
		fGUI.initEditor();
		conectar.intibatePapo();
		tema.gerarPalavra();
		tema.palavraAdvinhar();
		tema.procuraPalavra("merda");
		
	}
}
