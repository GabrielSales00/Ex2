/*
Bloco de finalização: Escreva um programa que demonstre o uso do bloco `finally`. Inclua cenários de execução normais e cenários em que as exceções são detectadas.
*/
import java.util.Scanner;
import java.io.*;

public class FinallyExample {
    public static void main(String[] args) {
        try {
            int res = 9 / 1;
            System.out.println("Resultado de uma execução normal: " + res);
            
            int resException = 9 / 0
        } catch (ArithmeticException erro) {
            System.out.println("Erro aritmético GRAVE: divisão por 0.");
        } finally {
            System.out.println("Chegou no bloco Finally.");
        }
        
        System.out.println("Programa continua após o bloco try-catch-finally.");
    }
}  
