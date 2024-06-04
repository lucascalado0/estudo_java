/*
08. Faça um Programa que leia três números e mostre o maior e o menor deles.
 */

package org.example;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numero1, numero2, numero3;

        System.out.println("Digite o primeiro número: ");
        numero1 = scanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        numero2 = scanner.nextDouble();

        System.out.println("Digite o terceiro número: ");
        numero3 = scanner.nextDouble();


        double maiorNumero = Math.max(numero1, Math.max(numero2, numero3));


        double menorNumero = Math.min(numero1, Math.min(numero2, numero3));


        System.out.println("O maior número é: " + maiorNumero);
        System.out.println("O menor número é: " + menorNumero);
    }
}