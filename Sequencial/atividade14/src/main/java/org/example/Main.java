/*
14. Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
 Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda,
 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
a. salário bruto.
b. quanto pagou ao INSS.
c. quanto pagou ao sindicato.
d. o salário líquido.
calcule os descontos e o salário líquido, conforme a tabela abaixo:
+ Salário Bruto : R$
- IR (11%) : R$
- INSS (8%) : R$
- Sindicato ( 5%) : R$
= Salário Liquido : R$
 */

package org.example;

import java.util.Scanner;
import java.util.Locale;
import java.text.DecimalFormat;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        DecimalFormat df = new DecimalFormat("#.00");

        double valorHora;
        int horasTrabalhadas;

        System.out.println("Informe quanto você ganha por hora trabalhada: ");
        valorHora = scanner.nextDouble();

        System.out.println("Informe quantas horas você trabalhou: ");
        horasTrabalhadas = scanner.nextInt();

        double salarioBruto = calcularSalarioBruto(valorHora, horasTrabalhadas);

        System.out.println("+ Salário Bruto: R$ " + df.format(salarioBruto));

        double ir = calcularIR(salarioBruto);
        System.out.println("- IR (11%): R$ " + df.format(ir));

        double inss = calcularINSS(salarioBruto);
        System.out.println("- INSS (8%): R$ " + df.format(inss));

        double sindicato = calcularPagamentoSindicato(salarioBruto);
        System.out.println("- Sindicato (5%): R$ " + df.format(sindicato));

        double salarioLiquido = salarioBruto - ir - inss - sindicato;

        System.out.println("= Salário Líquido: R$ " + df.format(salarioLiquido));
    }

    private static double calcularSalarioBruto(double valorHora, int horasTrabalhadas) {
        return valorHora * horasTrabalhadas;
    }

    private static double calcularINSS(double salarioBruto) {
        return salarioBruto * 0.08;
    }

    private static double calcularPagamentoSindicato(double salarioBruto) {
        return salarioBruto * 0.05;
    }

    private static double calcularIR(double salarioBruto) {
        return salarioBruto * 0.11;
    }
}