/*
05. Faça um Programa que converta metros para centímetros.
*/

package org.example;
import java.util.Scanner;


public class Main {

    public static double coverterMetros(double medidaMetro){

        return medidaMetro * 100;

    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a medida em metros: ");
        double metros = scanner.nextDouble();

        System.out.println(coverterMetros(metros) + "cm");
    }
}