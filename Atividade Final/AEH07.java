/*
Múltiplos blocos de captura: Crie um programa que execute uma divisão e o acesso a um vetor. Use vários blocos catch para capturar diferentes tipos de exceções (por exemplo, `ArithmeticException`, `ArrayIndexOutOfBoundsException`) e fornecer mensagens de erro apropriadas.
*/


import java.util.Scanner;

public class AEH07 {
    public static void main(String[] args) {
        try {
            Scanner entrada =  new Scanner(System.in);
            float dividendo = 0, divisor = 0;
            int indice;
            
	            System.out.println("Digite o Dividendo: ");
	            dividendo = entrada.nextFloat();
	            System.out.println("Agora digite o Divisor: ");
	            divisor = entrada.nextFloat();
	            System.out.println("Digite o índice do vetor: ");
	            indice = entrada.nextInt();
	            
            entrada.close();
            
            float resultado = dividir(dividendo, divisor);
            System.out.println("\nResultado da divisão: " + resultado);
            
            int[] vetor = {1, 2, 3};
            int valor = acessarVetor(vetor, indice);
            System.out.println("Valor do vetor no índice(" + indice + "): " + valor);
            
        } catch (ArithmeticException e) {
            System.err.println("Erro de divisão por zero: " + e.getMessage());
            
        } catch (ArrayIndexOutOfBoundsException e) {    
            System.err.println("Erro de acesso a índice inválido: " + e.getMessage());
        
        }
    }

    public static float dividir(float dividendo, float divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
            
        }
        return dividendo / divisor;
        
    }

    
    public static int acessarVetor(int[] vetor, int indice) {
        if (indice < 0 || indice >= vetor.length) {
            throw new ArrayIndexOutOfBoundsException("Índice fora dos limites do vetor.");
        }
        return vetor[indice];
    }
}
