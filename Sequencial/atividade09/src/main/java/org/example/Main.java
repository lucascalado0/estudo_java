/*
09. Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.
C = 5 * ((F-32) / 9).
 */

package org.example;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static double converterTemperatura(double temperaturaFahrenheit){
        return 5 * ((temperaturaFahrenheit - 32) / 9);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double temperaturaFahrenheit;

        System.out.println("Informe a temperatura em Fahrenheit: ");
        temperaturaFahrenheit = scanner.nextDouble();

        System.out.println("Temperatura em Celsius:" + converterTemperatura(temperaturaFahrenheit) + "°C");
    }
}