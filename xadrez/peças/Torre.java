package xadrez.peças;

import tabuleiro.Tabuleiro;
import xadrez.Chesspiece;

public class Torre extends Chesspiece {

    public Torre(Tabuleiro tabuleiro, xadrez.color color) {
        super(tabuleiro, color);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String toString(){
        return "R";
    }
    
}
