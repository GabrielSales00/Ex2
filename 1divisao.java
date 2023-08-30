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

