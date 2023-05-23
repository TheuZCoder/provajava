package Prova2305;

import java.util.Scanner;

import java.util.Random;

/**
 * prova
 */
public class Exercicios {
    int linhas, colunas;
    int[][] matriz;
    Random aleatorio = new Random();
    Scanner leitura = new Scanner(System.in);

    public void ex1() {

        System.out.println("digite o numero de linhas de sua matriz");
        linhas = leitura.nextInt();
        System.out.println("digite o numero de colunas de sua matriz");
        colunas = leitura.nextInt();
        matriz = new int[linhas][colunas];
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = aleatorio.nextInt(10);
            }
        }
        System.out.println("  MATRIZ ORIGINAL");
        for (int i = 0; i < linhas; i++) { // 1° dimensão
            System.out.print("| ");
            for (int j = 0; j < colunas; j++) { // 2° dimensão

                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println("|");
        }
        System.out.println("  MATRIZ ALTERADA");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (i > j) {
                    matriz[i][j] = 1;
                } else if (i == j) {
                    matriz[i][j] = 0;
                } else {
                    matriz[i][j] = 2;
                }
            }
        }
        for (int i = 0; i < linhas; i++) { // 1° dimensão
            System.out.print("| ");
            for (int j = 0; j < colunas; j++) { // 2° dimensão

                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println("|");
        }
    }

    public void ex2() {
        int numeroSorteado = aleatorio.nextInt(10);
        int palpite;
        int tentativas = 0;
        Boolean tenteNovamente = true;
        System.out.println("digite um palpite entre 0 a 1000");
        while (tenteNovamente) {

            palpite = leitura.nextInt();
            if (palpite > numeroSorteado) {
                System.out.println("o palpite é menor que o numero sorteado");
            } else if (palpite < numeroSorteado) {
                System.out.println("o palpite é maior que o numero sorteado");
            } else {
                System.out.println("Você acertou parabens / voce acertou em " + (tentativas + 1) + " tentativas");
                tenteNovamente = false;
            }
            tentativas++;
        }

    }

    public void ex3() {
        int tamanhoVetor = aleatorio.nextInt(901) + 100;
        int[] matriz = new int[tamanhoVetor];

        for (int i = 0; i < tamanhoVetor; i++) {
            matriz[i] = aleatorio.nextInt(100);
        }
        for (int i = 0; i < tamanhoVetor; i++) { // 1° dimensão
            System.out.print(matriz[i] + " ");
        }
        System.out.println("  NUMEROS PARES:");
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i] % 2 == 0) {
                System.out.print(matriz[i] + " ");

            }
        }
        System.out.println("  NUMEROS IMPARES:");
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i] % 2 != 0) {
                System.out.print(matriz[i] + " ");
            }
        }
        System.out.println("PARES EM CASAS IMPARES:");
        int count = 0;
        for (int i = 1; i < matriz.length; i += 2) {
            if (matriz[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("IMPARES EM CASAS PARES");
        for (int i = 0; i < matriz.length; i += 2) {
            if (matriz[i] % 2 != 0) {
                count++;

            }
        }
    }
}
