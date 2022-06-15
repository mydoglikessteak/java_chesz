package xadrez.peças;

import tabuleiro.Tabuleiro;
import xadrez.Chesspiece;

public class Cavalo extends Chesspiece {

    public Cavalo(Tabuleiro tabuleiro, xadrez.color color) {
        super(tabuleiro, color);
    }

    @Override
    public String toString(){
        return "H";
    }
    
}
