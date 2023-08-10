package usuario;

import aparelhoMultifuncional.IPhone;
import funcionalidades.navegarNaInternet;
import funcionalidades.reproduzirMusica;
import funcionalidades.telefonar;

public class joaopedro  {
    public static void main(String[] args) throws Exception {
        
        IPhone iphone = new IPhone();

        navegarNaInternet navegar = iphone;
        telefonar telefone = iphone;
        reproduzirMusica reprodutorMusical = iphone;

        navegar.adicionarNovaAba();
        navegar.atualizarPagina();
        navegar.exibirPagina();
        telefone.atender();
        telefone.ligar();
        telefone.iniciarCorreioVoz();
        reprodutorMusical.tocar();
        reprodutorMusical.pausar();
        reprodutorMusical.selecionarMusica();
    }
}
