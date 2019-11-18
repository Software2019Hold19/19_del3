package GUI;

import GameBoard.GameBoard;
import GameBoard.Field;
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
    private PlayerObserver pObs;
    //PlayerObserver p1Obs = new PlayerObserver(p1);

    public GUIController(Translator _lib, GameBoard _board) {
        Translator lib = _lib;
        GameBoard board = _board;
        //GUI_Field[];
        GUI gui = new GUI();
    }

    public void updatePlayerPos(Player p){
        GUI_Player pObj = pObs.update(p);
        this.gui.getFields()[p.getLastFieldNumber()].setCar(pObj, false);
        this.gui.getFields()[p.getFieldNumber()].setCar(pObj, true);
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
        GUI_Field[] guiFields = new GUI_Field[24];
        Field[] fields = board.getBoard();
        int i = 0;
        for (Field field : fields){
            String type = field.getType();
            switch(type){
                case ("start"):
                    guiFields[i] = new GUI_Start(field.getName(), field.getSubName(), field.getDesc(), Color.RED, Color.BLACK);

                case ("street"):
                    switch (field.getColor())
                        //new GUI_Street("RÃ¸dovrevej", "Pris:  60", "RÃ¸dovrevej", "Leje:  20", new Color(75, 155, 225), Color.BLACK);


                case ("visiting"):


                case ("chance"):



            i++;

            }


        }
        return guiFields;
    }


    public GUI getGui() {
        return gui;
    }

}
