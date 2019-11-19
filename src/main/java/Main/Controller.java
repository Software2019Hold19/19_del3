package Main;

import ChanceDeck.ChanceDeck;
import GUI.GUIController;
import GameBoard.GameBoard;

import java.io.IOException;
import java.util.Arrays;

public class Controller {
    Translator lib = new Translator("Dansk");
    GameBoard board = new GameBoard(lib);
    GUIController gui = new GUIController(lib, board);
    Player[] pLst;
    ChanceDeck deck = new ChanceDeck();
    Dice dice = new Dice();

    public Controller() throws IOException {
        
    }

    // Init players and language
    public void startGame() throws IOException {
        String selectedL = gui.getPlayerDropbown("Vælg Sprog / Choose Language", "Dansk", "English");
        lib.getLanguage(selectedL);
        gui.updateLanguage(lib);

        gui.showMessage(lib.text.get("Welcome"));

        String playerCountstr = gui.getPlayerDropbown(lib.text.get("NumberOfPlayers"), "2", "3", "4");
        int playerCount = Integer.parseInt(playerCountstr);
        int startBal = 24-2*playerCount;

        while (true) {

            boolean sameName = false;
            pLst = new Player[playerCount];
            for (int i = 0; i < playerCount; i++) {
                Player p = new Player(gui.getUserString(String.format(lib.text.get("InputName"), i + 1)), startBal);
                pLst[i] = p;
            }

            for (int i = 0; i < pLst.length; i++) {
                for (int j = i + 1; j < pLst.length; j++) {
                    if (pLst[i].getName().equals(pLst[j].getName())) {
                        sameName = true;
                        gui.showMessage(lib.text.get("SameName"));
                    }
                }
            }

            if (!sameName){
                break;
            }
        }

        gui.addPlayers(pLst);

    }



}
