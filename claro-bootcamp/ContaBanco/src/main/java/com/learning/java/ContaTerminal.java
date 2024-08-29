package com.learning.java;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    private static Integer numero;
    private static String conta;
    private static String nomeCliente;
    private static Double saldo;


    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência !");
        numero = input.nextInt();
        System.out.println("Por favort, digite o numero da sua conta!");
        conta = input.next();
        System.out.println("Por favor, digite o seu nome!");
        input.nextLine();
        nomeCliente = input.nextLine();
        System.out.println("Por favor, digite o seu saldo inicial!");
        saldo = input.nextDouble();

        System.out.printf("\nOla %s, obrigado por criar uma conta em nosso banco, " +
                        "sua agência é %s, conta %d e seu saldo %.2f%n já está disponível para saque."
                , nomeCliente.toUpperCase(), conta, numero, saldo);

        input.close();
    }
}
