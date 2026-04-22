package Mario;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random gerador = new Random();

        Scanner input = new Scanner(System.in);

        Mario mario = new Mario();


        while (mario.getVidas() > 0) {

            mario.mostrarStatus();

            int eventos = gerador.nextInt(1, 6);

            switch (eventos) {
                case 1:
                    System.out.println("Apareceu um cogumelo");
                    break;
                case 2:
                    System.out.println("Apareceu uma pena");
                    break;
                case 3:
                    System.out.println("Apareceu uma flor");
                    break;
                case 4:
                    System.out.println("Apareceu um inimgo");
                    break;
                case 5:
                    System.out.println("Apareceu um buraco");
                    break;
            }

            System.out.println("""
                    ---------------
                    Pressione [1]: para mostrar status
                    Pressione [2]: para andar
                    Pressione [3]: para pular
                    ---------------""");

            int acao = input.nextInt();

            switch (acao) {
                case 1:

                    mario.mostrarStatus();
                    break;

                case 2:

                    if (eventos == 1) {

                        mario.anda();
                        System.out.println("E você o pegou! +100 pontos");
                        mario.pegaCogumelo();
                        mario.ganhaPontos(100);

                    } else if (eventos == 2) {

                        mario.anda();
                        System.out.println("E você a pegou! +100 pontos");
                        mario.ganhaPontos(100);

                    } else if (eventos == 3) {

                        mario.anda();
                        System.out.println("E você a pegou! +100 pontos");
                        mario.ganhaPontos(100);

                    } else if (eventos == 4) {

                        mario.anda();
                        System.out.println("E você foi de encontro a ele! -1 vida");
                        mario.perdeVida(1);

                    } else if (eventos == 5) {

                        mario.anda();
                        System.out.println("E você caiu no buraco! -2 vidas");
                        mario.perdeVida(2);

                    }

                    break;

                case 3:

                    if (eventos == 1) {

                        mario.pula();
                        System.out.println("E você pulou por cima?! Sem cogumelo então");

                    } else if (eventos == 2) {

                        mario.pula();
                        System.out.println("E você pulou por cima?! Sem peninha então");

                    } else if (eventos == 3) {

                        mario.pula();
                        System.out.println("E você pulou por cima?! Sem flor então");

                    } else if (eventos == 4) {

                        mario.pula();
                        System.out.println("E você pulou encima dele e o derrotou! +150 pontos! ");
                        mario.ganhaPontos(150);

                    } else if (eventos == 5) {

                        mario.pula();
                        System.out.println("E você pulou encima dele! +50 pontos! ");
                        mario.ganhaPontos(50);

                    }

                    break;

            }

        }
    }
}
