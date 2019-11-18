package Main;

import GUI.GUIController;
import GameBoard.GameBoard;

import java.io.IOException;

public class Controller {
    Translator lib = new Translator("Dansk");
    GameBoard board = new GameBoard(lib);
    GUIController gui = new GUIController(lib, board);
    Player[] pLst;

    public Controller() throws IOException {
        
    }

    // Init players and language
    public void startGame() throws IOException {
        String selectedL = gui.getPlayerDropbown("Vælg Sprog / Choose Language", "Dansk", "English");
        lib.getLanguage(selectedL);

        String playerCountstr = gui.getPlayerDropbown(lib.text.get("NumberOfPlayers"), "2", "3", "4");
        int playerCount = Integer.parseInt(playerCountstr);
        int startBal = 24-2*playerCount;
    
        pLst = new Player[playerCount];
        for (int i = 0; i < playerCount; i++){
            Player p = new Player(gui.getUserString(String.format(lib.text.get("InputName"), i + 1)), startBal);
            pLst[i] = p;
        }

        for (Player p : pLst){
            gui.addPlayer(p);
        }
    }


}
