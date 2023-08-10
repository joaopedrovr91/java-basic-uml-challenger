package aparelhoMultifuncional;

import funcionalidades.navegarNaInternet;
import funcionalidades.reproduzirMusica;
import funcionalidades.telefonar;

public class IPhone implements navegarNaInternet, reproduzirMusica, telefonar {
    @Override
    public void ligar() {
        System.out.println("ligando no iPhone");
    }

    @Override
    public void atender() {
        System.out.println("atendendo no iPhone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("ouvindo correio de voz no iPhone");
    }

    @Override
    public void tocar() {
        System.out.println("tocando musica no iPhone");
    }

    @Override
    public void pausar() {
        System.out.println("pausando musica no iPhone");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("selecionado musica no iPhone");
    }

    @Override
    public void exibirPagina() {
        System.out.println("exibindo pagina no iPhone");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("adicionando pagina no iPhone");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("atualizando pagina no iPhone");
    }
}
