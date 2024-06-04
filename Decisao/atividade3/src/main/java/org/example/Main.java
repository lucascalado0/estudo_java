/*
Faça um Programa que verifique se uma letra digitada é "F" ou "M".
Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
 */

package org.example;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String sexo;

        System.out.println("Informe o seu sexo(F ou M): ");
        sexo = scanner.next().toUpperCase();

        switch (sexo) {

            case "M": {
                System.out.println("M - Masculino");
                break;
            }
            case "F": {
                System.out.println("F - Feminino");
                break;
            }
            default: {
                System.out.println("Sexo Inválido");
                break;
            }
        }
    }
}