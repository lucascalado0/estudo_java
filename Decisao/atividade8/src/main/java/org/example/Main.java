/*
08. Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, sabendo que a decisão é sempre pelo mais barato.

 */

package org.example;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double produtoA, produtoB, produtoC;

        System.out.println("Informe o preço do produto A:");
        produtoA = scanner.nextDouble();

        System.out.println("Informe o preço do produto B: ");
        produtoB = scanner.nextDouble();

        System.out.println("Informe o preço do produto C: ");
        produtoC = scanner.nextDouble();

        double produtoMaisBarato = Math.min(produtoA,Math.min(produtoB,produtoC));

        if(produtoMaisBarato == produtoA) {
            System.out.println("Produto mais barato é o produto A!");
        }
        else if(produtoMaisBarato == produtoB){
            System.out.println("Produto mais barato é o produto B!");
        }
        else {
            System.out.println("Produto mais barato é o produto C!");
        }
    }
}