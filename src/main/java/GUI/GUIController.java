package GUI;

import GameBoard.GameBoard;
import GameBoard.Field;
import Main.Player;
import Main.Translator;
//Side Fields
import gui_fields.*;

import java.awt.*;

//Corner Fields


public class GUIController {

    Player p1 = new Player("test");
    PlayerObserver p1Obs = new PlayerObserver(p1);

    public GUIController(Translator _lib, GameBoard _board) {
        Translator lib = _lib;
        GameBoard board = _board;
    }



    private void boardSetup(GameBoard board){
        GUI_Field[] guiFields = new GUI_Field[40];
        Field[] fields = board.getBoard();
        int i = 0;
        for (Field field : fields){
            String type = field.getType();
            switch(type){
                case ("start"):
                    //guiFields[i] = new GUI_Start(field.getName());

                case ("street"):
                    Color color = new Color(0,0,0);


                case ("visiting"):


                case ("chance"):



            i++;

        }


        }
    }

}
