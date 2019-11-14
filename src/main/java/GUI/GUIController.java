package GUI;

import GameBoard.GameBoard;
import GameBoard.Field;
import Main.Translator;
//Side Fields
import gui_fields.GUI_Street;
import gui_fields.GUI_Chance;

//Corner Fields
import gui_fields.GUI_Start;
import gui_fields.GUI_Jail; //both GoToJail and VisitingJail
import gui_fields.GUI_Refuge;

public class GUIController {

    public GUIController(Translator _lib, GameBoard _board) {
        Translator lib = _lib;
        GameBoard board = _board;
    }

    private void boardSetup(GameBoard board){
        Field[] fields = board.getBoard();
        for (Field field : fields){
            String type;
            switch(type){
        }


        }
    }

}
