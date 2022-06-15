package xadrez;

import tabuleiro.Posicao;
import tabuleiro.PosiçaoXadrez;
import tabuleiro.Tabuleiro;
import xadrez.peças.Peao;
import xadrez.peças.Rei;
import xadrez.peças.Torre;

public class Partida {

    private Tabuleiro tabuleiro;

    public Partida(){
        tabuleiro = new Tabuleiro(8,8);
        peçasIniciais();
    }

    public Chesspiece [][] getPeças(){
        Chesspiece[][] mat = new Chesspiece[tabuleiro.getLinhas()] [tabuleiro.getColunas()];

        for(int i = 0;i<tabuleiro.getLinhas();i++)
        for(int j= 0;j<tabuleiro.getColunas();j++){
            mat[i][j] = (Chesspiece)tabuleiro.peça(i,j);
        }
    
        return mat;
    }

    private void botarNovaPeça(char coluna,int linha,Chesspiece peça){
        tabuleiro.botarPeça(peça, new tabuleiro.PosiçaoXadrez(coluna, linha).toPosition());
    }

    private void peçasIniciais(){
        // tabuleiro.botarPeça(new Peao(tabuleiro, color.WHITE),new Posicao(1, 7))
        // tabuleiro.botarPeça(new Rei(tabuleiro, color.BLACK),new Posicao(7, 3));
        botarNovaPeça('b', 6, new Torre(tabuleiro, color.BLACK));
    }
      
}
