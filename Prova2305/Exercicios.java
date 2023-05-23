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
}