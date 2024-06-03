/*
12. Tendo como dados de entrada a altura de uma pessoa,construa um algoritmo que calcule seu peso ideal,
 usando a seguinte fórmula: (72.7*altura) - 58
 */

package org.example;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static double calcularPesoIdeal(double altura) {
        return (72 * altura) - 58;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double altura;

        System.out.println("Informe a sua altura: ");
        altura = scanner.nextDouble();

        System.out.println("Seu peso ideal: " + calcularPesoIdeal(altura) + "kg");
    }
}