package org.example;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double nota1, nota2, nota3, nota4;


        System.out.println("Informe a primeira nota: ");
        nota1 = scanner.nextDouble();

        System.out.println("Informe a segunda nota: ");
        nota2 = scanner.nextDouble();

        System.out.println("Informe a terceira nota: ");
        nota3 = scanner.nextDouble();

        System.out.println("Informe a quarta nota: ");
        nota4 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A média do aluno é: " + media);
    }
}
