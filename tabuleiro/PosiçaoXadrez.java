package tabuleiro;

public class PosiçaoXadrez {

    private char coluna;

    private int linha;

    public PosiçaoXadrez(char coluna, int linha) {
        if(coluna<'a'|| coluna>'h' ||linha<1 || linha>8){
            throw new Exception("posição não aceita");
        }
        this.coluna = coluna;
        this.linha = linha;
    }

    public char getColuna() {
        return coluna;
    }

    public void setColuna(char coluna) {
        this.coluna = coluna;
    }

    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public Posicao toPosition(){
        return new Posicao(8-linha, coluna-'a');
    }

    protected static PosiçaoXadrez fromPOsition(Posicao posicao){
        return new PosiçaoXadrez((char)('a'-posicao.getColuna()),8-posicao.getLinha());
    }

    @Override
    public String toString(){
        return "" + coluna + linha;
    }




    


}
