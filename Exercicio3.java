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

            System.out.println("Voce obteve: " + dado1 + " + " + dado2 + " = " + soma + "\n");

            if (ponto == 0) {
                if (soma == 7 || soma == 11) {
                    System.out.println("Voce venceu!"+ "\n");
                    break;
                } else if (soma == 2 || soma == 3 || soma == 12) {
                    System.out.println("Voce perdeu!"+ "\n");
                    break;
                } else {
                    ponto = soma;
                    System.out.println("ponto = " + ponto+ "\n");
                }
            } else {
                if (soma == ponto) {
                    System.out.println("Voce venceu ao fazer o ponto novamente!\n");
                    break;
                } else if (soma == 7) {
                    System.out.println("Voce perdeu ao tirar um 7 antes do ponto!\n");
                    break;
                }
            }
        }
    }
}
