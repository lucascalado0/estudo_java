/*
08.Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
 Calcule e mostre o total do seu salário no referido mês.
 */
package org.example;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static int calcularSalario(int ganhoHora, int horaTrabalhada) {
        return ganhoHora * horaTrabalhada;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int ganhoHora;
        int horaTrabalhada;

        System.out.println("Informe quanto você ganha por hora: ");
        ganhoHora = scanner.nextInt();

        System.out.println("Informe quantas horas você trabalhou: ");
        horaTrabalhada = scanner.nextInt();

        System.out.println("Seu salário é: R$" + calcularSalario(ganhoHora, horaTrabalhada));
        ;


    }
}