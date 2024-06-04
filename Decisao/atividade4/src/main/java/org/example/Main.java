/*
04. Faça um Programa que verifique se uma letra digitada é vogal ou consoante.
 */

package org.example;

import java.util.Scanner;
import java.lang.String;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char letra;

        System.out.println("Digite uma letra do alfabeto: ");
        letra = scanner.next().toLowerCase().charAt(0);

        if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.println("A letra é uma vogal!");
        }
        else {
            System.out.println("A letra é uma consoante!");
        }
    }
}