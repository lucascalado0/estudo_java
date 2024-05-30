/*
04. Faça um programa, com uma função que necessite de um argumento.
A função retorna o valor de caractere ‘P’, se seu argumento for positivo, e ‘N’, se seu argumento for zero ou negativo.
*/

package org.example;

import java.util.Scanner;

public class Main {
    public static char verificarNumero(int numero) {
        if (numero <= 0) {
            return 'N';
        } else {
            return 'P';
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um valor qualquer: ");
        int numero = scanner.nextInt();

        System.out.println(verificarNumero(numero));
    }
}