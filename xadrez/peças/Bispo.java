package xadrez.peças;

import tabuleiro.Tabuleiro;
import xadrez.Chesspiece;

public class Bispo extends Chesspiece {

    public Bispo(Tabuleiro tabuleiro, xadrez.color color) {
        super(tabuleiro, color);
    }

    @Override
    public String toString(){
        return "B";
    }
    
}
