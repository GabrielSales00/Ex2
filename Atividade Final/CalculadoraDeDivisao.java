
/*

    Divisão por Zero: Escreva um programa que receba dois números como entrada e calcule sua divisão. Implemente o tratamento de exceção para lidar com o caso em que o denominador é zero.

    Entrada inválida: Crie um programa que solicite ao usuário uma entrada de número inteiro. Lide com o caso em que o usuário insere uma entrada não numérica capturando `NumberFormatException`.

    Acesso a posição de vetor: Escreva um programa que inicialize um array e então tente acessar um elemento em um índice além dos seu limite. Use o tratamento de exceção para capturar `ArrayIndexOutOfBoundsException`.

*/

import java.util.Scanner;

public class CalculadoraDeDivisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o numerador: ");
        double numerador = scanner.nextDouble();

        System.out.print("Digite o denominador: ");
        double denominador = scanner.nextDouble();

        try {
            double resultado = dividir(numerador, denominador);
            System.out.println("Resultado da divisão: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero não é permitida.");
        }

        scanner.close();
    }

    public static double dividir(double numerador, double denominador) throws ArithmeticException {
        if (denominador == 0) {
            throw new ArithmeticException("Divisão por zero.");
        }
        return numerador / denominador;
    }
}

