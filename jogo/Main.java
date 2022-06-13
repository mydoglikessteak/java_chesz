package jogo;
import xadrez.Partida;

public class Main {
    public static void main(String[]args){
        Partida partida = new Partida();
        UI.printBoard(partida.getPeças());
       }
}
