package uff.ic.lleme.tcc00328.exercicios

import java.util.Random;

public class JogoDeDados {
    public static void main(String[] args) {
        Random rand = new Random();
        int ponto = 0;

        while (true) {
            int dado1 = rand.nextInt(6) + 1;
            int dado2 = rand.nextInt(6) + 1;
            int soma = dado1 + dado2;

            System.out.println("Você lançou os dados e obteve: " + dado1 + " + " + dado2 + " = " + soma);

            if (ponto == 0) {
                if (soma == 7 || soma == 11) {
                    System.out.println("Você venceu!");
                    break;
                } else if (soma == 2 || soma == 3 || soma == 12) {
                    System.out.println("Você perdeu!");
                    break;
                } else {
                    ponto = soma;
                    System.out.println("Seu ponto é " + ponto);
                }
            } else {
                if (soma == ponto) {
                    System.out.println("Você venceu ao fazer o ponto novamente!");
                    break;
                } else if (soma == 7) {
                    System.out.println("Você perdeu ao tirar um 7 antes do ponto!");
                    break;
                }
            }
        }
    }
}
