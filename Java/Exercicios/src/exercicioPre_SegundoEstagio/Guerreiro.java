package exercicioPre_SegundoEstagio;

public class Guerreiro extends abstract_Personagem implements interface_HabilidadeEspecial{

    int forca;

    public Guerreiro(String nome, int nivel, int vida, int forca) {

        super(nome, nivel, vida);
        this.forca = forca;

    }

    public String getTipo() {

        return "Guerreiro";

    }

    @Override
    public void atacar() {

        System.out.println("O guerreiro " + getNome() + " atacou com sua espada!");

    }


    @Override
    public void usarHabilidadeEspecial() {

        System.out.println("O guerreiro usou Golpe Brutal");

    }

}
