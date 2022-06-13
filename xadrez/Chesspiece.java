package xadrez;

import tabuleiro.Peça;
import tabuleiro.Tabuleiro;

public class Chesspiece extends Peça {
    
    private color color;
    
    public Chesspiece(Tabuleiro tabuleiro, xadrez.color color) {
        super(tabuleiro);
        this.color = color;
    }
    
    
        public color getColor() {
            return color;
        }

}
