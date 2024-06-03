/*
02. Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.
 */

package org.example;

import java.util.Locale;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double numero;

        System.out.println("Informe um número: ");
        numero = scanner.nextDouble();

        if(numero < 0) {
            System.out.println("O número é negativo");
        }
        else if(numero > 0){
            System.out.println("O número é positivo");
        }
        else {
            System.out.println("O número informado é 0");
        }

    }
}