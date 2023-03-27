package provaJava;

import java.util.Scanner;

/**
 * exercicios
 */
public class exercicios {
    Scanner leitura = new Scanner(System.in);
    double num1, num2, resultado;
    int escolha;

    public void ex1() {

        System.out.print("Digite o primeiro número: ");
        num1 = leitura.nextDouble();

        System.out.print("Digite o segundo número: ");
        num2 = leitura.nextDouble();

        System.out.println("Escolha a operação aritmética a ser realizada:");
        System.out.println("1. Adição");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");

        escolha = leitura.nextInt();

        resultado = 0;

        switch (escolha) {
            case 1:
                resultado = num1 + num2;
                break;
            case 2:
                resultado = num1 - num2;
                break;
            case 3:
                resultado = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Não é possível dividir por zero.");
                    return;
                }
                break;
            default:
                System.out.println("Operação inválida.");
                return;
        }

        System.out.println("O resultado da operação é: " + resultado);

    }

    public void ex2(){
        int matricula,time;

        System.out.print("Digite o número de matrícula do aluno: ");
        matricula = leitura.nextInt();

        time = (matricula % 4) + 1;

        switch (time) {
            case 1:
                System.out.println("O aluno de matrícula " + matricula + " foi designado para o Time do Chris.");
                break;
            case 2:
                System.out.println("O aluno de matrícula " + matricula + " foi designado para o Time do Greg.");
                break;
            case 3:
                System.out.println("O aluno de matrícula " + matricula + " foi designado para o Time do Caruso.");
                break;
            case 4:
                System.out.println("O aluno de matrícula " + matricula + " foi designado para o Time do Jerome.");
                break;
        }

    }
    public void ex3(){
        double morangos,macas,bananas,total;

        System.out.print("Quantidade de morangos (em kg): ");
        morangos = leitura.nextDouble();

        System.out.print("Quantidade de maçãs (em kg): ");
        macas = leitura.nextDouble();

        System.out.print("Quantidade de bananas (em kg): ");
        bananas = leitura.nextDouble();

        total = (morangos * 3.5) + (macas * 2.3) + (bananas * 1.8);

        if (total > 30 || (morangos + macas + bananas) > 15) {
            total *= 0.9;
        }

        System.out.printf("Valor a ser pago: R$ %.2f\n", total);

        leitura.close();
    }
}