package xadrez;

import tabuleiro.Tabuleiro;

public class Partida {

    private Tabuleiro tabuleiro;

    public Partida(){
        tabuleiro = new Tabuleiro(8,8);
    }

    public Chesspiece [][] getPeças(){
        Chesspiece[][] mat = new Chesspiece[tabuleiro.getLinhas()] [tabuleiro.getColunas()];

        for(int i = 0;i<tabuleiro.getLinhas();i++){
        for(int j= 0;j<tabuleiro.getColunas();j++){
            mat[i][j] = (Chesspiece)tabuleiro.peça(i,j);
        }}
    
        return mat;
    }
      
}
