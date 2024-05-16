import iphone.AparelhoTelefonico;
import iphone.Iphone;
import iphone.NavegadorInternet;
import iphone.ReprodutorMusical;

public class Usuario {
	public static void main(String[] args) {
		Iphone ph = new Iphone();
		
	    ReprodutorMusical reprodutorMusical = ph;
		AparelhoTelefonico aparelhoTelefonico = ph;
		NavegadorInternet navegadorInternet = ph;
		
				
		
	
    
	reprodutorMusical.selecionarMusica();
		
	}
}