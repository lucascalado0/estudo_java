/*
06. Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
*/


package org.example;

import java.util.Scanner;

public class Main {

    public static double calcularArea(double raio) {
        double PI = 3.14;
        return (raio * 2) * PI;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double raio;

        System.out.println("Informe o raio do circulo: ");
        raio = scanner.nextDouble();

        System.out.println("Area do circulo: " + calcularArea(raio));
    }
}