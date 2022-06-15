package xadrez.peças;

import tabuleiro.Tabuleiro;
import xadrez.Chesspiece;

public class Rainha extends Chesspiece {

    public Rainha(Tabuleiro tabuleiro, xadrez.color color) {
        super(tabuleiro, color);
    }

    @Override
    public String toString(){
        return "Q";
    }
    
}
