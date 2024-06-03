/*
15.João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho.
Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos)
deve pagar uma multa de R$ 4,00 por quilo excedente. João precisa que você faça um programa que leia a variável peso (peso de peixes)
e calcule o excesso. Gravar na variável excesso a quantidade de quilos além do limite e na variável multa o valor da multa que João deverá
pagar.
Imprima os dados do programa com as mensagens adequadas.
 */


package org.example;

import java.util.Scanner;
import java.util.Locale;
import java.text.DecimalFormat;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println("Joao, insira o peso total dos peixes pescados: ");
        double peso = scanner.nextDouble();

        System.out.println("Total de impostos a serem pagos: R$" + df.format(calcularImposto(peso)));
    }

    public static double calcularImposto(double peso) {

        return (peso - 50) * 4;
    }
}