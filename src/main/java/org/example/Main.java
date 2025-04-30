package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a idade do visitante: ");
        int idade = scanner.nextInt();

        System.out.print("Informe a quantidade de bilhetes: ");
        int quantidade = scanner.nextInt();

        try {
            int total = TicketCalculator.totalPrice(idade, quantidade);
            System.out.println("Valor total a pagar: R$" + total);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
