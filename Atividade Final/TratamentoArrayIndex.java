/*
Acesso a posição de vetor: Escreva um programa que inicialize um array e então tente acessar um elemento em um índice além dos seu limite. Use o tratamento de exceção para capturar `ArrayIndexOutOfBoundsException`.
*/

public class TratamentoArrayIndex {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };

        try {
            int elemento = array[10]; // Tentando acessar o elemento no índice 10
            System.out.println("Elemento: " + elemento);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: O índice está fora dos limites do array.");
        }
    }
}

