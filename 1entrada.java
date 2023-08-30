import java.util.Scanner;

public class TratamentoNumeroInteiro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite um número inteiro: ");
            String input = scanner.nextLine();
            int numero = Integer.parseInt(input);
            System.out.println("Você digitou o número: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Erro: Entrada inválida. Certifique-se de digitar um número inteiro.");
        }

        scanner.close();
    }
}

