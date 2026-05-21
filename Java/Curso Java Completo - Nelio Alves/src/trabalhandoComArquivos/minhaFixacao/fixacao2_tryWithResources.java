package trabalhandoComArquivos.minhaFixacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class fixacao2_tryWithResources {
    static void main(String[] args) {

        String caminho = "C:\\Users\\romer\\Documents\\paraJavaFile.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
            String linhaDeTexto = br.readLine();
            while (linhaDeTexto != null) {
                IO.println(linhaDeTexto);
                linhaDeTexto = br.readLine();
            }
        }
        catch (IOException e) {
            IO.println("Error" + e.getMessage());
        }
    }
}
