package Main;

import ChanceDeck.ChanceDeck;
import GUI.GUIController;
import GameBoard.GameBoard;

import java.io.IOException;
import java.util.Arrays;

import javax.sound.sampled.SourceDataLine;

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

        gui.showMessage(lib.text.get("Welcome"));

        String playerCountstr = gui.getPlayerDropbown(lib.text.get("NumberOfPlayers"), "2", "3", "4");
        playerCount = Integer.parseInt(playerCountstr);
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

        playGame();
    }

    private void playGame() {
        int turnCount = 0;
        int turnCountTotal = 0;

        while (hasPlayerNotWon()) {
            if(turnCount >= playerCount)
                turnCount = 0;

            playerTurn(pLst[turnCount]);

            turnCount++;
            turnCountTotal++;

            if (turnCountTotal % 100 == 0) {
                System.out.println("Turn Count total: " + turnCountTotal);
            }
                

           // gui.showMessage("Næste spiller tur");
        }

        gui.showMessage("Du har vundet spillet");
    }

    private boolean hasPlayerNotWon() {
        boolean isGameFinished = false;
        for (Player p : pLst) {

            // if player has no money or over 100
            if(p.getBal() == 0 || p.getBal() >= 100)
                isGameFinished = true;  

        }
        return !isGameFinished;
    }


    private void playerTurn(Player p) {
        int diceroll[] = dice.roll();
        int diceTotal = diceroll[0] + diceroll[1];

        gui.showDiceOnBoard(diceroll[0],diceroll[1]);

        p.move(diceTotal);

        board.getBoard()[p.getFieldNumber()].landOnField(p,pLst,deck);

        gui.updatePlayers(pLst);
    }



}


