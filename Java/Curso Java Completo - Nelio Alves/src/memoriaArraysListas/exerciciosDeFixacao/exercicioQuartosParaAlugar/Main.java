package memoriaArraysListas.exerciciosDeFixacao.exercicioQuartosParaAlugar;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Students[] rooms = new Students[10];

        System.out.print("How many rooms will be rented? ");
        int numeroDeEstudantes = input.nextInt();

        for (int i = 0; i < numeroDeEstudantes; i++) {

            System.out.println();
            System.out.println("Rent #" + (i + 1));

            System.out.print("Name: ");
            String nome = input.next();

            input.nextLine();
            System.out.print("Email: ");
            String email = input.next();

            System.out.print("Room: ");
            int quarto = (input.nextInt() - 1);

            if (rooms[quarto] == null) {

                rooms[quarto] = new Students(nome, email);

            }

        }

        System.out.println();
        System.out.println("Busy rooms: ");
        for (int i = 0; i < rooms.length; i++) {

            if (rooms[i] != null) {

                System.out.println(rooms[i] + ": " + rooms[i].toString());

            }

        }

    }

}
