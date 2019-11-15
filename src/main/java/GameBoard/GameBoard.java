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
        //initiates all fields
        // form: fieldname from translator key, type, price, color
        String[] txtlst = lib.text.get("Start").split(":");
        board[0] = new StartField(txtlst[0],"start");
        board[1] = new StreetField(lib.text.get("Brun1"),"street", 1, "brown");
        board[2] = new StreetField(lib.text.get("Brun2"),"street", 1, "brown");
        board[3] = new ChanceField(lib.text.get("Chance"), "chance");
        board[4] = new StreetField(lib.text.get("Lyseblå1"),"street", 1, "cyan");
        board[5] = new StreetField(lib.text.get("Lyseblå2"),"street", 1, "cyan");
        board[6] = new VisitingField(lib.text.get("PåBesøg"), "visit");
        board[7] = new StreetField(lib.text.get("Lilla1"),"street", 2, "magenta");
        board[8] = new StreetField(lib.text.get("Lilla2"),"street", 2, "magenta");
        board[9] = new ChanceField(lib.text.get("Chance"), "chance");
        board[10] = new StreetField(lib.text.get("Gul1"),"street", 2, "yellow");
        board[11] = new StreetField(lib.text.get("Gul2"),"street", 2, "yellow");
        board[12] = new VisitingField(lib.text.get("GratisParkering"),"visit");
        board[13] = new StreetField(lib.text.get("Rød1"),"street", 3, "red");
        board[14] = new StreetField(lib.text.get("Rød2"),"street", 3, "red");
    }

    public Field[] getBoard() {
        return board;
    }
}
