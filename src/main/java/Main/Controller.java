package Main;

import ChanceDeck.ChanceDeck;
import GUI.GUIController;
import GameBoard.GameBoard;

import java.io.IOException;

public class Controller {
    Translator lib = new Translator("Dansk");
    GameBoard board = new GameBoard(lib);
    GUIController gui = new GUIController(lib, board);
    Player[] pLst;
    ChanceDeck deck = new ChanceDeck();
    Dice dice = new Dice();
    int playerCount;
    public Controller() throws IOException {
        
    }

    // Init players and language
    public void startGame() throws IOException {
        String selectedL = gui.getPlayerDropbown("Vælg Sprog / Choose Language", "Dansk", "English");
        lib.getLanguage(selectedL);
        gui.updateLanguage(lib);


        String playerCountstr = gui.getPlayerDropbown(lib.text.get("NumberOfPlayers"), "2", "3", "4");
        playerCount = Integer.parseInt(playerCountstr);
        int startBal = 24-2*playerCount;
    
        pLst = new Player[playerCount];
        for (int i = 0; i < playerCount; i++){
            Player p = new Player(gui.getUserString(String.format(lib.text.get("InputName"), i + 1)), startBal);
            pLst[i] = p;
        }
        
        gui.addPlayers(pLst);

        playGame();
    }

    private void playGame() {
        int turnCount = 0;

        while (true) {
         playerTurn(pLst[turnCount]);

         if(turnCount >= playerCount)
            turnCount = 0;
         else
             turnCount++;
            break;
        }

    }

    private void playerTurn(Player p) {
        int diceroll[] = dice.roll();
        int diceTotal = diceroll[0] + diceroll[1];

        gui.showDiceOnBoard(diceroll[0],diceroll[1]);

        p.move(diceTotal);
        gui.updatePlayers(pLst);

        board.getBoard()[p.getFieldNumber()].landOnField(p,pLst,deck);

    }


}


