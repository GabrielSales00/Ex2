/*
Limpeza de recursos: Crie um programa que abra um arquivo para gravação e grave algum conteúdo nele. Use um bloco try-with-resources para garantir que o arquivo seja fechado corretamente, mesmo se ocorrer uma exceção.
Log: Integre o log (usando uma biblioteca como Log4j ou o `java.util.logging` embutido) em seu código de tratamento de exceção. Demonstre como o log pode ajudar a fornecer uma visão melhor sobre o que aconteceu durante uma exceção
*/

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class WriteToFileLog {
    private static final Logger logger = LogManager.getLogger(WriteToFile.class);

    public static void main(String[] args) {
        String fileName = "output.txt";
        String content = "Este é o conteúdo do arquivo.";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
            System.out.println("Arquivo gravado com sucesso.");
        } catch (IOException e) {
            logger.error("Ocorreu um erro ao gravar o arquivo.", e);
        }
    }
}
