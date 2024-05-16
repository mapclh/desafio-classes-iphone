package iphone;

import iphone.AparelhoTelefonico;
import iphone.NavegadorInternet;
import iphone.ReprodutorMusical;


public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    public void ligar() {
        System.out.println("Ligando com Iphone");
    }
    public void atender() {
        System.out.println("Desligando com Iphone");
    }
    public void iniciarCorreioVoz() {
        System.out.println("Inicando correio de voz com Iphone");
    }
    
    public void exibirPagina() {
        System.out.println("Exibindo página com Iphone");
    }
    public void adicionarNovaAba() {
    System.out.println("Adicionando nova aba com Iphone");
    }
    public void atualizarPagina() {
        System.out.println("Atualizando página com Iphone");
    }

    public void tocar() {
        System.out.println("Tocando com Iphone");
    }
    public void pausar() {
        System.out.println("Pausando com Iphone");
    }
    public void selecionarMusica() {
        System.out.println("Selecionando musica com Iphone");
    }


}

 