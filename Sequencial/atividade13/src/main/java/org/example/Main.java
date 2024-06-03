/*
13. Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
Para homens: (72.7*h) - 58
Para mulheres: (62.1*h) - 44.7
 */
package org.example;

import java.util.Scanner;
import java.util.Locale;
import java.text.DecimalFormat;


public class Main {
    public static double calcularPesoIdealHomem(double altura){
        return (72.7 * altura) - 58;
    }
    public static double calcularPesoIdealMulher(double altura) {
        return (62.1 * altura) - 44.7;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        DecimalFormat df = new DecimalFormat("#.00");

        double altura;
        String genero;

        System.out.println("Qual a sua altura? ");
        altura = scanner.nextDouble();

        System.out.println("Você é homem(h) ou mulher(m)? ");
        genero = scanner.next();

        switch (genero) {
            case "m": {
                System.out.println("Seu peso ideal: " + df.format(calcularPesoIdealMulher(altura)));
            }
            case "h": {
                System.out.println("Seu peso ideal: " + df.format(calcularPesoIdealHomem(altura)));
            }
        }

    }
}