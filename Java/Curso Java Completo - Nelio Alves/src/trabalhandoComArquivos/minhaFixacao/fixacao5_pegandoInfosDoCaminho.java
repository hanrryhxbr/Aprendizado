package trabalhandoComArquivos.minhaFixacao;

import java.io.File;
import java.util.Scanner;

public class fixacao5_pegandoInfosDoCaminho {
    static void main() {

        Scanner input = new Scanner(System.in);

        String caminho = IO.readln("Digite o caminho do arquivo: \n");
        File arquivo = new File(caminho);

        IO.println("NOME: " + arquivo.getName());
        IO.println("DIRETÓRIO: " + arquivo.getParent());
        IO.println("CAMINHO: " + arquivo.getPath());

        input.close();
    }
}
