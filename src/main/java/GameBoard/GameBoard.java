package GameBoard;

import Main.Translator;

public class GameBoard {
    Field[] board;


    public GameBoard(Translator _lib){
        Translator lib = _lib;
        board = new Field[24];
        initGame();
    }

    public void initGame(){


    }

}
