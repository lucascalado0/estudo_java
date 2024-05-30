/*
10. Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.
 */

package org.example;

import java.util.Scanner;
import java.util.Locale;


public class Main {

        public static double converterTemperatura(double temperaturaCelsius){
            return (1.8 * temperaturaCelsius) + 32;
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            double temperaturaCelsius;

            System.out.println("Informe a temperatura em Celsius: ");
            temperaturaCelsius = scanner.nextDouble();


            System.out.println("Temperatura em Celsius: " + converterTemperatura((temperaturaCelsius)) + "°F");
        }
    }
