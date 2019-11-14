package GameBoard;

import Main.Translator;

public class GameBoard {
    private Field[] board;
    Translator lib;

    public GameBoard(Translator _lib){
        this.lib = _lib;
        board = new Field[24];
        initGame();
    }

    public void initGame(){
        board[0] = new StartField(lib.text.get("Start0"));
        board[1] = new StreetField("Brun1", 1, "brown");
        board[2] = new StreetField("name", 1, "brown");
        board[3] = new ChanceField("Chance");
        board[4] = new StreetField("name", 1, "cyan");
        board[5] = new StreetField("name", 1, "cyan");
        board[6] = new VisitingField("På besøg");
        board[7] = new StreetField("name", 2, "magenta");
        board[8] = new StreetField("name", 2, "magenta");

    }

    public Field[] getBoard() {
        return board;
    }
}
