/*
01. Faça um Programa que peça dois números e imprima o maior deles.
 */

package org.example;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double numero1, numero2;

        System.out.println("Informe um número: ");
        numero1 = scanner.nextDouble();

        System.out.println("Informe outro número: ");
        numero2 = scanner.nextDouble();

        if(numero1 > numero2){
            System.out.println("Maior número é: " + numero1);
        } else {
            System.out.println("Maior número é: " + numero2);
        }
    }
}