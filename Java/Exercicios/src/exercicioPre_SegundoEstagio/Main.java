package exercicioPre_SegundoEstagio;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<abstract_Personagem> personagens = new ArrayList<>();

        boolean jogar = true;

        while (jogar) {

            try {
                System.out.println("""
                    
                    ===== ARENA DE TREINAMENTO =====
                    1 - Cadastrar Guerreiro
                    2 - Cadastrar Mago
                    3 - Cadastrar Arqueiro
                    4 - Listar personagens
                    5 - Atacar com todos os personagens
                    6 - Usar habilidades especiais
                    7 - Sair
                    """);

                int opcoes = input.nextInt();

                switch (opcoes) {

                    case 1:

                        System.out.print("Nome: ");
                        String nomeGuerreiro = input.next();
                        System.out.print("Nivel: ");
                        int nivelGuerreiro = input.nextInt();
                        System.out.print("Vida: ");
                        int vidaGuerreiro = input.nextInt();
                        System.out.print("Força: ");
                        int forca = input.nextInt();
                        personagens.add(new Guerreiro(nomeGuerreiro, nivelGuerreiro, vidaGuerreiro, forca));
                        System.out.println();

                        break;

                    case 2:

                        System.out.print("Nome: ");
                        String nomeMago = input.next();
                        System.out.print("Nivel: ");
                        int nivelMAgo = input.nextInt();
                        System.out.print("Vida: ");
                        int vidaMago = input.nextInt();
                        System.out.print("Mana: ");
                        int mana = input.nextInt();
                        personagens.add(new Mago(nomeMago, nivelMAgo, vidaMago, mana));
                        System.out.println();

                        break;

                    case 3:

                        System.out.print("Nome: ");
                        String nomeArqueiro = input.next();
                        System.out.print("Nivel: ");
                        int nivelArqueiro = input.nextInt();
                        System.out.print("Vida: ");
                        int vidaArqueiro = input.nextInt();
                        System.out.print("Quantidade de flechas: ");
                        int flechas = input.nextInt();
                        personagens.add(new Mago(nomeArqueiro, nivelArqueiro, vidaArqueiro, flechas));
                        System.out.println();

                        break;

                    case 4:

                        if (personagens.isEmpty()) {

                            System.out.println("Você ainda não cadastrou nenhum personagem.");

                        } else {

                            System.out.println("Lista de personagens: ");
                            System.out.println();
                            for (abstract_Personagem personagem : personagens) {

                                System.out.print("Tipo: " + personagem.getTipo());
                                System.out.println();
                                personagem.exibirStatus();
                                System.out.println();

                            }

                        }

                        break;

                    case 5:

                        if (personagens.isEmpty()) {

                            System.out.println("Você ainda não cadastrou nenhum personagem");

                        } else {

                            for (abstract_Personagem personagem : personagens) {

                                personagem.atacar();

                            }
                            System.out.println();

                        }

                        break;

                    case 6:

                        if (personagens.isEmpty()) {

                            System.out.println("Você ainda não cadastrou nenhum personagem");

                        } else {

                            for (abstract_Personagem personagem : personagens) {

                                if (personagem instanceof interface_HabilidadeEspecial especial) {

                                    especial.usarHabilidadeEspecial();

                                }

                            }
                            System.out.println();

                        }

                        break;

                    case 7:

                        System.out.println("Saindo...");
                        jogar = false;
                        break;

                    default:
                        throw new IllegalArgumentException("");

                }

            } catch (IllegalArgumentException | InputMismatchException e) {

                System.out.println("Erro: Input inválido");

            } catch (RecursoInsuficienteException e) {

                System.out.println("Erro: " + e.getMessage());

            }

        }

        input.close();

    }

}
