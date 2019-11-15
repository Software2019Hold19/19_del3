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
        board[1] = new StreetField(lib.text.get("Brown1"),"street", 1, "brown");
        board[2] = new StreetField(lib.text.get("Brown2"),"street", 1, "brown");
        board[3] = new ChanceField(lib.text.get("Chance"), "chance");
        board[4] = new StreetField(lib.text.get("Lightblue1"),"street", 1, "cyan");
        board[5] = new StreetField(lib.text.get("Lightblue2"),"street", 1, "cyan");
        board[6] = new VisitingField(lib.text.get("Visiting"), "visit");
        board[7] = new StreetField(lib.text.get("Purple1"),"street", 2, "magenta");
        board[8] = new StreetField(lib.text.get("Purple2"),"street", 2, "magenta");
        board[9] = new ChanceField(lib.text.get("Chance"), "chance");
        board[10] = new StreetField(lib.text.get("Orange1"),"street", 2, "orange");
        board[11] = new StreetField(lib.text.get("Orange2"),"street", 2, "orange");
        board[12] = new VisitingField(lib.text.get("FreeParking"),"visit");
        board[13] = new StreetField(lib.text.get("Red1"),"street", 3, "red");
        board[14] = new StreetField(lib.text.get("Red2"),"street", 3, "red");
        board[15] = new ChanceField(lib.text.get("Chance"),"chance");
        board[16] = new StreetField(lib.text.get("Yellow1"),"street", 3, "yellow");
        board[17] = new StreetField(lib.text.get("Yellow2"),"street", 3, "yellow");
        board[18] = new GoToJailField(lib.text.get("GoToJail"),"jail");
        board[19] = new StreetField(lib.text.get("Green1"),"street", 4, "green");
        board[20] = new StreetField(lib.text.get("Green2"),"street", 4, "green");
        board[21] = new ChanceField(lib.text.get("Chance"),"chance");
        board[22] = new StreetField(lib.text.get("Darkblue1"),"street", 4, "blue");
        board[23] = new StreetField(lib.text.get("Darkblue2"),"street", 4, "blue");


    }

    public Field[] getBoard() {
        return board;
    }
}
