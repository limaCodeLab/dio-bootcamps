package com.learning.java;


import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = input.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = input.nextInt();
        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }

        input.close();

    }

    public static void contar(int parametroUm, int parametroDois) {
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException();
        }

        for (int i = parametroUm; i < parametroDois; i++){
            System.out.println("Imprimindo o numero " + i);
        }
    }


}
