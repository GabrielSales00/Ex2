import java.util.Scanner;

public class AEH08 {
    public static void main(String[] args) {
        try {
            Scanner entrada =  new Scanner(System.in);
            float dividendo = 0, divisor = 0;
            
	            System.out.println("Digite o Dividendo: ");
	            dividendo = entrada.nextFloat();
	            System.out.println("Agora digite o Divisor: ");
	            divisor = entrada.nextFloat();
	            
            entrada.close();
            
            float resultado = dividir(dividendo, divisor);
            System.out.println("\nResultado da divisão: " + resultado);
            
        } catch (ArithmeticException exEncad) {
        	System.out.println(exEncad);
            System.err.println("Causa: " + exEncad.getMessage());
            
        }
    }

    public static float dividir(float dividendo, float divisor) {
        if (divisor == 0) {
            ArithmeticException exEncad = new ArithmeticException("Não é possível dividir por zero.");
            exEncad.initCause(new ArithmeticException());
            
            throw exEncad;
            
        }
        return dividendo / divisor;
        
    }
}
