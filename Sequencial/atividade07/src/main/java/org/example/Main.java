/*
07. Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.
 */

package org.example;

import java.util.Scanner;

public class Main {
    public static double calcularAreaQuadrado(double ladoQuadrado) {
        return ladoQuadrado * ladoQuadrado;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double lado;

        System.out.println("Informe o lado do quadrado: ");
        lado = scanner.nextDouble();

        System.out.println("Area do quadrado: " + calcularAreaQuadrado(lado) + "cm²");

        System.out.println("Dobro da area: " + calcularAreaQuadrado(lado) * 2 + "cm²");
    }
}