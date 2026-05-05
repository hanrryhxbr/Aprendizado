package exercicioPre_SegundoEstagio;

public class Arqueiro extends abstract_Personagem implements interface_HabilidadeEspecial{

    int flechas;

    public Arqueiro(String nome, int nivel, int vida, int flechas) {

        super(nome, nivel, vida);
        this.flechas = flechas;

    }

    @Override
    public void atacar() throws RecursoInsuficienteException {

        if (flechas < 1) {

            throw new RecursoInsuficienteException("O arqueiro está sem flechas");

        }

        System.out.println("O arqueiro " + getNome() + " disparou uma flecha!");
        flechas -= 1;

    }

    @Override
    public void usarHabilidadeEspecial() throws RecursoInsuficienteException {
        try {

            if (flechas < 3) {

                throw new RecursoInsuficienteException("Flechas insuficientes para usar habilidade especial.");

            }

            System.out.println("O mago " + getNome() + " usou Chuva de Flechas!");
            flechas -= 3;

        } catch (RecursoInsuficienteException e) {

            System.out.println("Erro especifico: " + e.getMessage());

        }

    }

    public int getFlechas() {

        return flechas;

    }

    public void setFlechas(int flechas) {

        this.flechas = flechas;

    }

    public String getTipo() {

        return "Arqueiro";

    }

}
