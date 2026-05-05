package exercicioPre_SegundoEstagio;

import java.security.InvalidParameterException;

public abstract class abstract_Personagem {

    private String nome;
    private int nivel;
    private int vida;

    public abstract_Personagem(String nome, int nivel, int vida) {

        this.nome = nome;
        this.nivel = nivel;
        this.vida = vida;

    }

    public abstract void atacar() throws RecursoInsuficienteException;

    public String getNome() {

        return nome;

    }

    public int getNivel() {

        return nivel;

    }

    public void setNivel(int nivel) {

        if (nivel < 1) {

            throw new IllegalArgumentException("Nivel deve ser igual ou maior que 1!");

        }

        this.nivel = nivel;

    }

    public int getVidas() {

        return vida;

    }

    public void setVidas(int vida) {

        if (vida < 0) {

            throw new IllegalArgumentException("Vida deve ser igual ou maior que 0!");

        }

        this.vida = vida;

    }

    public void exibirStatus() {

        System.out.printf("""
                Nome: %s
                Nivel: %d
                Vidas: %d
                """, this.nome, this.nivel, this.vida);

    }

    public abstract String getTipo();

}
