package org.example;

public class TicketCalculator {
    public static int priceByAge(int idade) {
        if (idade < 0) throw new IllegalArgumentException("Idade inválida");
        if (idade <= 12) return 10;
        if (idade <= 59) return 30;
        return 15;
    }

    public static int totalPrice(int idade, int quantidade) {
        if (quantidade <= 0)
            throw new IllegalArgumentException("Quantidade deve ser maior que zero");
        if (quantidade > 5)
            throw new IllegalArgumentException("Quantidade excede o limite (máximo 5)");
        return priceByAge(idade) * quantidade;
    }
}
