package trabalhandoComArquivos.minhaFixacao;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class fixacao1 {
    void main() {

        File file = new File("C:\\Users\\romer\\Documents\\paraJavaFile.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                IO.println(sc.nextLine());
            }
        }
        catch (IOException e) {
            IO.println("Error" + e.getMessage());
        }
        finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}
