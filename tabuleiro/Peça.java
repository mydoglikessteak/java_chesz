package tabuleiro;

public class Peça {

    protected Posicao position;

    protected Tabuleiro tabuleiro;

    public Peça(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;
        position = null;
    }

    protected Tabuleiro getTabuleiro() {
        return tabuleiro;
    }

   

    
}
