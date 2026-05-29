package trabalhandoComArquivos.minhaFixacao;

import java.io.File;
import java.util.Scanner;

public class fixacao4_pastas {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o caminho para a pasta desejada: ");
        String caminho = input.nextLine();

        File pasta = new File(caminho);

        int contadorPastas = 0;
        File[] subPastas = pasta.listFiles(File::isDirectory);
        for (File subPasta : subPastas) {
            contadorPastas++;
            System.out.println("DIRETÓRIO " + contadorPastas + ": ");
            System.out.println(subPasta);
        }

        int contadorArquivos = 0;
        File[] arquivos = pasta.listFiles(File::isFile);
        for (File arquivo : arquivos) {
            contadorArquivos++;
            System.out.println("ARQUIVO " + contadorArquivos + ": ");
            System.out.println(arquivo);
        }

        boolean sucesso = new File(caminho + "\\subPasta").mkdir();
        System.out.println("DIRETÓRIO CRIADO: " + sucesso);

        input.close();
    }
}
