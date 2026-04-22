package EstruturasCondicionais.ExerciciosOpcionais;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

    static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double A = input.nextInt();
        double B = input.nextInt();
        input.close();

        if (!(A > B)) {
            double temp = A;
            A = B;
            B = temp;
        }
        //Alternativamente, poderia ser usado o método Math.max() e Math.min()//

        if ((A / B) % 1 == 0) {

            System.out.println("Sao multiplos");

        } else {

            System.out.println("Nao sao multiplos");

        }

    }

}
