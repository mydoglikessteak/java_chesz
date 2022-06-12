package tabuleiro;

public class Tabuleiro { // board

    private int linhas;

    private int colunas;

    private Peça [] [] peças;

    public Tabuleiro(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
        peças = new Peça [linhas] [colunas];
    }
    
}
