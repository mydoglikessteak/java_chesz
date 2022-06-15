package xadrez.peças;

import tabuleiro.Tabuleiro;
import xadrez.Chesspiece;

public class Peao extends Chesspiece {

    public Peao(Tabuleiro tabuleiro, xadrez.color color) {
        super(tabuleiro, color);
    }

    @Override
    public String toString(){
        return "P";
    }
    
}
