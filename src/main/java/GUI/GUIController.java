package GUI;

import GameBoard.GameBoard;
import GameBoard.Field;
import GameBoard.StreetField;
import Main.Player;
import Main.Translator;
//Side Fields
import gui_fields.*;
import gui_main.GUI;

import java.awt.*;

//Corner Fields


public class GUIController {

    private GameBoard board;
    private GUI gui;
    private PlayerObserver pObs = new PlayerObserver();
    private Object Field;
    private Translator lib;
    //PlayerObserver p1Obs = new PlayerObserver(p1);

    public GUIController(Translator _lib, GameBoard _board) {
        lib = _lib;
        board = _board;
        //GUI_Field[];
        gui = new GUI(boardSetup(board));
    }



    public void showMessage(String txt){
        this.gui.showMessage(txt);
    }

    public String getPlayerDropbown(java.lang.String msg, java.lang.String... buttons)
    {
        return gui.getUserSelection(msg,buttons);
    }

    public String getUserString(String msg) {
        return gui.getUserString(msg);
    }

    public void addPlayer(Player p){
        GUI_Player pObj = pObs.update(p);
        gui.addPlayer(pObj);
        gui.getFields()[0].setCar(pObj, true);
    }

    private GUI_Field[] boardSetup(GameBoard board){
        FieldFactory fieldFac = new FieldFactory();
        return fieldFac.boardSetup(board);
    }


    public GUI getGui() {
        return gui;
    }

    public void updateLanguage(){
        String[] fieldLst = {
                "Start",
                "Brown1","Brown2",
                "Chance",
                "Lightblue1", "Lightblue2",
                "Visiting",
                "Purple1", "Purple2",
                "Chance",
                "Orange1", "Orange2",
                "FreeParking",
                "Red1", "Red2",
                "Chance",
                "Yellow1", "Yellow2",
                "GoToJail",
                "Green1", "Greed2",
                "Chance",
                "Darkblue1", "Darkblue2",
        };

        int i = 0;
        for (GUI_Field field : gui.getFields()){
            field.setTitle(lib.text.get((fieldLst[i])));
            field.setDescription(lib.text.get((fieldLst[i])));
            field.setSubText(lib.text.get((fieldLst[i])));
            i++;
        }



    }

}
