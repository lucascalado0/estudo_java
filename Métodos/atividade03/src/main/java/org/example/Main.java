package org.example;
import java.util.Scanner;


public class Main {

    //declarando metodo somar
    public static int somar(int numero1, int numero2, int numero3){

    return numero1 + numero2 + numero3;

}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o segundo numero: ");
        int numero1 = scanner.nextInt();

        System.out.println("Informe o segundo numero: ");
        int numero2 = scanner.nextInt();

        System.out.println("Informe o terceiro numero: ");
        int numero3 = scanner.nextInt();

        System.out.println("Resultado da soma: " + somar(numero1, numero2, numero3)); //chamando metodo somar
    }


}