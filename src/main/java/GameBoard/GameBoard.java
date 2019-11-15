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
        board[1] = new StreetField(lib.text.get("Brun1"), 1, "brown");
        board[2] = new StreetField(lib.text.get("Brun2"), 1, "brown");
        board[3] = new ChanceField(lib.text.get("Chance3"));
        board[4] = new StreetField(lib.text.get("Lyseblå4"), 1, "cyan");
        board[5] = new StreetField(lib.text.get("Lyseblå5"), 1, "cyan");
        board[6] = new VisitingField(lib.text.get("PåBesøg6"));
        board[7] = new StreetField(lib.text.get("Lilla7"), 2, "magenta");
        board[8] = new StreetField(lib.text.get("Lilla8"), 2, "magenta");
        board[9] = new ChanceField(lib.text.get("Chance3"));
        board[10] = new StreetField(lib.text.get("Gul9"), 2, "yellow");
        board[11] = new StreetField(lib.text.get("Gul10"), 2, "yellow");
        board[12] = new VisitingField(lib.text.get("GratisParkering11"));
        board[13] = new StreetField(lib.text.get("Rød12"), 3, "red");
        board[14] = new StreetField(lib.text.get("Rød13"), 3, "red");
    }

    public Field[] getBoard() {
        return board;
    }
}
