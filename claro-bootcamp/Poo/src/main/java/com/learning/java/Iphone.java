package com.learning.java;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    // Aparelho Telefônico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada");

    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando o ligação");
    }


    // Navegador Internet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a pagina: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a pagina");
    }

    @Override
    public void fecharNavegador() {
        System.out.println("Fechando o navegador");
    }


    // Reprodutor Musical
    @Override
    public void tocar() {
        System.out.println("Tocando");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a musica: " + musica);
    }

    @Override
    public void fecharReprodutor() {
        System.out.println("Fechando o reprodutor");
    }

}
