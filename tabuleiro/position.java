//boardgame
package tabuleiro;

public class position {

    private int linha ; // row


    private int coluna; // column


    public position(int linha, int coluna) {
        this.linha = linha;
        this.coluna = coluna;
    }


    public int getLinha() {
        return linha;
    }


    public void setLinha(int linha) {
        this.linha = linha;
    }


    public int getColuna() {
        return coluna;
    }


    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

    public String toString(){
        return linha + ", " + coluna;
    }
    
}
