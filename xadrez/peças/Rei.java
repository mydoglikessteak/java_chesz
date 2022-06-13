package xadrez.peças;

import tabuleiro.Tabuleiro;
import xadrez.Chesspiece;

public class Rei extends Chesspiece {

    public Rei(Tabuleiro tabuleiro, xadrez.color color) {
        super(tabuleiro, color);
    }

    @Override
    public String toString(){
        return "K";
    }
    
}
