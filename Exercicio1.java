package uff.ic.lleme.tcc00328.exercicios.LucasGranier

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class HistogramGenerator {
    public static void main(String[] args) {
        int N = 100; // Valor padrão para N, você pode alterar conforme necessário

        if (args.length > 0) {
            try {
                N = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.err.println("Erro: O argumento deve ser um número inteiro.");
                System.exit(1);
            }
        }

        // Gerar números aleatórios e criar o arquivo
        generateRandomNumbers(N);

        // Calcular o histograma e imprimir
        int[] histogram = calculateHistogram(N);
        printHistogram(histogram);
    }

    public static void generateRandomNumbers(int N) {
        try {
            FileWriter writer = new FileWriter("numeros_aleatorios.txt");
            Random random = new Random();

            for (int i = 0; i < N; i++) {
                int numeroAleatorio = random.nextInt(100); // Números entre 0 e 99
                writer.write(numeroAleatorio + "\n");
            }

            writer.close();
            System.out.println("Arquivo 'numeros_aleatorios.txt' criado com sucesso.");
        } catch (IOException e) {
            System.err.println("Erro ao criar o arquivo.");
            e.printStackTrace();
        }
    }

    public static int[] calculateHistogram(int N) {
        int[] histogram = new int[100]; // 100 posições para representar números de 0 a 99

        try {
            java.util.Scanner scanner = new java.util.Scanner(new java.io.File("numeros_aleatorios.txt"));

            while (scanner.hasNext()) {
                int numero = Integer.parseInt(scanner.nextLine());
                histogram[numero]++;
            }

            scanner.close();
        } catch (java.io.FileNotFoundException e) {
            System.err.println("Arquivo 'numeros_aleatorios.txt' não encontrado.");
            e.printStackTrace();
        }

        return histogram;
    }

    public static void printHistogram(int[] histogram) {
        System.out.println("Histograma dos números gerados:");

        for (int i = 0; i < histogram.length; i++) {
            System.out.println(i + ": " + histogram[i]);
        }
    }
}
