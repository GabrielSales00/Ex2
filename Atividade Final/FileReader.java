/*
Leitura de arquivo: Crie um programa que leia dados de um arquivo. Implemente o tratamento de exceções usando um bloco try-catch para lidar com quaisquer IOExceptions que possam ocorrer durante a operação.
*/


import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class FileReader {
    public static void main (String [] args) {
        try {
            String buffer;
            File txtFile = new File("Arquivo de texto.txt");
            Scanner reader = new Scanner(txtFile);
            while (reader.hasNextLine()) {
                buffer = reader.nextLine();
                System.out.println(buffer);
            }
            reader.close();
        }
        catch (FileNotFoundException error) {
            System.out.println("Algo deu errado.");
            error.printStackTrace();
        }
    }
}
