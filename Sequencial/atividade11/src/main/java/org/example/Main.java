/*
11. Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
- o produto do dobro do primeiro com metade do segundo .
- a soma do triplo do primeiro com o terceiro.
- o terceiro elevado ao cubo.
*/
package org.example;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static double calcularProduto(double numero1, double numero2){
        return (2 * numero1) * (numero2 / 2);
    }
    public static double calcularSoma(double numero1, double numero3){
        return (3 * numero1) + numero3;
    }

    public static double calcularCubo (double numero3) {
        return numero3 * numero3 * numero3;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double numero1, numero2, numero3;

        System.out.println("Informe um número inteiro: ");
        numero1 = scanner.nextDouble();

        System.out.println("Informe outro número inteiro: ");
        numero2 = scanner.nextDouble();

        System.out.println("Agora informe um número REAL: ");
        numero3 = scanner.nextDouble();

        System.out.println("Produto do dobro do primeiro com metade do segundo: " + calcularProduto(numero1, numero2));

        System.out.println("A soma do triplo do primeiro com o terceiro: " + calcularSoma(numero1, numero3));

        System.out.println("Terceiro elevado ao cubo: " + calcularCubo(numero3));
    }
}