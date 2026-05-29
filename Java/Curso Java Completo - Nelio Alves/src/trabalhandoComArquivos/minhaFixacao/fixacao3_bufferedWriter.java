package trabalhandoComArquivos.minhaFixacao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class fixacao3_bufferedWriter {
    static void main() {

        String [] entrada = new String [] {"ALFABETO", "BETOALFA", "OTEBAFLA"};
        int contador = 0;
        String caminho = "C:\\Users\\romer\\Documents\\saidaJavaWriter.txt";
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(caminho/*, true*/))) {
            escritor.write("CONTADOR: " + contador);
            for (String linha : entrada) {
                escritor.write(linha);
                escritor.newLine();
            }
        }
        catch (IOException e) {
            IO.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
