package Prova2305;

import java.util.Scanner;

import java.util.Random;


/**
 * prova
 */
public class prova {
    Random aleatorio = new Random();
    Scanner leitura = new Scanner(System.in);
    int linhas,colunas;
    int[][] matriz = new int[linhas][colunas];

    public void ex1() {
        System.out.println("digite o numero de colunas de sua matriz");
        colunas = leitura.nextInt();
        System.out.println("digite o numero de linhas de sua matriz");
        linhas = leitura.nextInt();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                matriz[i][j] = aleatorio.nextInt();
            }
        }

    }
}