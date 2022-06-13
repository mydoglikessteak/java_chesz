package tabuleiro;

public class Tabuleiro { // board

    private int linhas;

    private int colunas;

    private Peça [] [] peças;

    public Tabuleiro(int linhas, int colunas) {
        if(linhas<1 && colunas<1){
            throw 
            new Exception("O tabuleiro deve ter no minimo 1 linha e 1 coluna");
        }
        this.linhas = linhas;
        this.colunas = colunas;
        peças = new Peça [linhas] [colunas];
    }

    public int getLinhas() {
        return linhas;
    }

    public int getColunas() {
        return colunas;
    }


    public Peça peça(int linha, int coluna){
        if(!posiçaoexiste(linha,coluna)){
            throw new Exception("Posição não existe");
        }
        return peças[linha][coluna];
    }

    public Peça peça(Posicao posicao){
        if(!posiçaoexiste(posicao)){
            throw new Exception("Posição não existe");
        }
        return 
        peças[posicao.getColuna()]
             [posicao.getColuna()];
    }

    public void botarPeça(Peça peça,Posicao posicao){
        if(jaTemUmaPeça(posicao)){
            throw new Exception("lugar ja ocupado");
        }
        peças[posicao.getLinha()][posicao.getColuna()] = peça;
        peça.position = posicao;
    }

    public boolean posiçaoexiste(Posicao posicao){
        return posiçaoexiste(posicao.getLinha(),posicao.getColuna());
    }

    private boolean posiçaoexiste(int linha,int coluna){
       return linha>=0 && linha<linhas && coluna>=0  && coluna<colunas;
    }

    public boolean jaTemUmaPeça(Posicao posicao){
        if(!posiçaoexiste(posicao)){
            throw new Exception("Posição não existe");
        }
        return peça(posicao) !=null;
    }
    
}
