package Main;

import GUI.GUIController;
import GameBoard.GameBoard;

import java.io.IOException;

public class Controller {
    Translator lib = new Translator("Dansk");
    GameBoard board = new GameBoard(lib);
    GUIController gui = new GUIController(lib, board);

    public Controller() throws IOException {
        
    }

    private void startGame() throws IOException {
        String selectedL = gui.getPlayerDropbown("Vælg Sprog / Choose Language", "Dansk", "English");
        lib.getLanguage(selectedL);

        String playerCount

    }


}
