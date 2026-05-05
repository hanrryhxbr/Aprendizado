package exercicioPre_SegundoEstagio;

public class Mago extends abstract_Personagem implements interface_HabilidadeEspecial{

    int mana;

    public Mago(String nome, int nivel, int vida, int mana) {

        super(nome, nivel, vida);
        this.mana = mana;

    }

    @Override
    public void atacar() {

        System.out.println("O mago " + getNome() + " lançou uma bola de fogo!");

    }

    @Override
    public void usarHabilidadeEspecial() throws RecursoInsuficienteException {

        if (mana < 10) {

            throw new RecursoInsuficienteException("Mana insuficiente para usar habilidade especial.");

        }

        System.out.println("O mago " + getNome() + " usou Tempestade Arcana!");
        mana -= 10;


    }

    public int getMana() {

        return mana;

    }

    public void setMana(int mana) {

        this.mana = mana;

    }

    public String getTipo() {

        return "Mago";

    }

}
