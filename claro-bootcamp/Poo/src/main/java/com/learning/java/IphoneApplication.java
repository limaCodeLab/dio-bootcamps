package com.learning.java;

public class IphoneApplication {

    public static void main(String[] args) {

        Iphone iphone = new Iphone();
        iphone.selecionarMusica("Plush");
        iphone.tocar();
        iphone.pausar();
        iphone.fecharReprodutor();

        iphone.exibirPagina("www.google.com.br");
        iphone.adicionarNovaAba();
        iphone.exibirPagina("www.github.com.br");
        iphone.atualizarPagina();
        iphone.fecharNavegador();

        iphone.ligar("123456789");
        iphone.atender();
        iphone.desligar();


    }
}
