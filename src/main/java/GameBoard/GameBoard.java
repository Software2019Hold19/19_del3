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

    public void boardUpdate(Translator _lib){
        this.lib = _lib;
        initGame();
    }

    public void initGame(){
        //initiates all fields
        // form: fieldname from translator key, subName from translator key, description from translator key, type, price, color
        // key is split by ":" to a String[]. index 0 = name, index 1 = subName, index 2 = desc
        String[] txtlst = lib.text.get("Start").split(":");
        board[0] = new StartField(txtlst[0], txtlst[1], txtlst[2],"start");

        txtlst = lib.text.get("Brown1").split(":");
        board[1] = new StreetField(txtlst[0], txtlst[1], txtlst[2],"street", 1, "brown");

        txtlst = lib.text.get("Brown2").split(":");
        board[2] = new StreetField(txtlst[0], txtlst[1], txtlst[2],"street", 1, "brown");

        txtlst = lib.text.get("Chance").split(":");
        board[3] = new ChanceField(txtlst[0], txtlst[1], txtlst[2], "chance");

        txtlst = lib.text.get("Lightblue1").split(":");
        board[4] = new StreetField(txtlst[0], txtlst[1], txtlst[2],"street", 1, "cyan");

        txtlst = lib.text.get("Lightblue2").split(":");
        board[5] = new StreetField(txtlst[0], txtlst[1], txtlst[2],"street", 1, "cyan");

        txtlst = lib.text.get("Visiting").split(":");
        board[6] = new VisitingField(txtlst[0], txtlst[1], txtlst[2], "jail");

        txtlst = lib.text.get("Purple1").split(":");
        board[7] = new StreetField(txtlst[0], txtlst[1], txtlst[2],"street", 2, "magenta");

        txtlst = lib.text.get("Purple2").split(":");
        board[8] = new StreetField(txtlst[0], txtlst[1], txtlst[2],"street", 2, "magenta");

        txtlst = lib.text.get("Chance").split(":");
        board[9] = new ChanceField(txtlst[0], txtlst[1], txtlst[2], "chance");

        txtlst = lib.text.get("Orange1").split(":");
        board[10] = new StreetField(txtlst[0], txtlst[1], txtlst[2],"street", 2, "orange");

        txtlst = lib.text.get("Orange2").split(":");
        board[11] = new StreetField(txtlst[0], txtlst[1], txtlst[2],"street", 2, "orange");

        txtlst = lib.text.get("FreeParking").split(":");
        board[12] = new VisitingField(txtlst[0], txtlst[1], txtlst[2],"visit");

        txtlst = lib.text.get("Red1").split(":");
        board[13] = new StreetField(txtlst[0], txtlst[1], txtlst[2],"street", 3, "red");

        txtlst = lib.text.get("Red2").split(":");
        board[14] = new StreetField(txtlst[0], txtlst[1], txtlst[2],"street", 3, "red");

        txtlst = lib.text.get("Chance").split(":");
        board[15] = new ChanceField(txtlst[0], txtlst[1], txtlst[2],"chance");

        txtlst = lib.text.get("Yellow1").split(":");
        board[16] = new StreetField(txtlst[0], txtlst[1], txtlst[2],"street", 3, "yellow");

        txtlst = lib.text.get("Yellow2").split(":");
        board[17] = new StreetField(txtlst[0], txtlst[1], txtlst[2],"street", 3, "yellow");

        txtlst = lib.text.get("GoToJail").split(":");
        board[18] = new GoToJailField(txtlst[0], txtlst[1], txtlst[2],"jail");

        txtlst = lib.text.get("Green1").split(":");
        board[19] = new StreetField(txtlst[0], txtlst[1], txtlst[2],"street", 4, "green");

        txtlst = lib.text.get("Green2").split(":");
        board[20] = new StreetField(txtlst[0], txtlst[1], txtlst[2],"street", 4, "green");

        txtlst = lib.text.get("Chance").split(":");
        board[21] = new ChanceField(txtlst[0], txtlst[1], txtlst[2],"chance");

        txtlst = lib.text.get("Darkblue1").split(":");
        board[22] = new StreetField(txtlst[0], txtlst[1], txtlst[2],"street", 5, "blue");

        txtlst = lib.text.get("Darkblue2").split(":");
        board[23] = new StreetField(txtlst[0], txtlst[1], txtlst[2],"street", 5, "blue");
    }

    public Field[] getBoard() {
        return board;
    }
}
