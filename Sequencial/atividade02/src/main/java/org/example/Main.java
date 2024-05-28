package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numero;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número: ");
        numero = scanner.nextInt();

        System.out.println("Número informado: " + numero);
    }
}