package Mario;

public class MarioPequeno extends EstadoDoMario {

    @Override
    public void pegaCogumelo(Mario mario) {

        System.out.println("O Mario.Mario ficou grande");
        mario.ganhaPontos(100);

        MarioGrande novoEstado = new MarioGrande();
        mario.mudarEstado(novoEstado);
    }

    @Override
    public void pegaPena(Mario mario) {

        System.out.println("O Mario.Mario ficou com Pena");
        mario.ganhaPontos(100);

        MarioPena novoEstado = new MarioPena();
        mario.mudarEstado(novoEstado);
    }

    @Override
    public void pegaFlor(Mario mario) {

        System.out.println("O Mario.Mario ficou com Flor");
        mario.ganhaPontos(100);

        MarioFlor novoEstado = new MarioFlor();
        mario.mudarEstado(novoEstado);
    }

    @Override
    public void levaDano(Mario mario) {

        System.out.println("O Mario.Mario levou dano");
        mario.ganhaPontos(-100);

        mario.perdeVida(1);
    }

    @Override
    public String getEstadoDoMario() {
        return "Mario.Mario Pequeno";
    }
}
