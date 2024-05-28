package org.example;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double numero1, numero2;


        System.out.println("Informe o primeiro número: ");
        numero1 = scanner.nextDouble();

        System.out.println("Informe o segundo número: ");
        numero2 = scanner.nextDouble();

        double soma = numero1 + numero2;

        System.out.println("A soma dos números informados é: " + soma);
    }
}