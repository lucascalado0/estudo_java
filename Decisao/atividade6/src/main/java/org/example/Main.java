/*
06. Faça um Programa que leia três números e mostre o maior deles.
 */


package org.example;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double numero1, numero2, numero3;

        System.out.println("Informe o primeiro numero: ");
        numero1 = scanner.nextDouble();

        System.out.println("Informe o segundo numero: ");
        numero2 = scanner.nextDouble();

        System.out.println("Informe o terceiro numero: ");
        numero3 = scanner.nextDouble();

        if(numero1 > numero2 && numero1 > numero3){
            System.out.println("Maior numero: " + numero1);
        }
        else if (numero2 > numero1 && numero2 > numero3){
            System.out.println("Maior numero: " + numero2);
        }
        else {
            System.out.println("Maior numero: " + numero3);
        }
    }
}