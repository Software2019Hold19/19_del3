package ChanceDeck;

import GUI.GUIController;
import GameBoard.GameBoard;
import Main.Controller;
import Main.Player;
import Main.Translator;

/**
 * ChoiceMoveChanceCard
 * (Move up to 5 fields) new car (1 field or take new chancecard)
 */
public class ChoiceMoveChanceCard extends MoveChanceCard {

    boolean moveUpToFiveFields;
    String moveFields = "-1";

    public ChoiceMoveChanceCard(String descriptionString, boolean moveFivefieldsCard) {
        super(descriptionString);
        moveUpToFiveFields = moveFivefieldsCard;
    }

    @Override
    public boolean drawn(Player player, GameBoard board) {
        // TODO Make player chose beween up to 5 filed or draw new card
      //  super.drawn(player, board);

        // Move (1-5 field) or card if 0 draw new card
        if (moveUpToFiveFields) {
            // Chose number of fields player want to move
            player.move(Integer.parseInt(moveFields));
            return true;
        }
        else {

            // choose to draw new card or move 1 field
            if (Integer.parseInt(moveFields) == 1) {
                player.move(1);
                return true;
            }

            else {
                //draw new card
                return true;
            }
        }
    }

    @Override
    public void guiHandler(GUIController gui, Translator lib){
        super.guiHandler(gui, lib);
        
        if (moveUpToFiveFields)
        {
            boolean second = false;
            
            do {
                if(second)
                    moveFields = gui.getUserString(lib.text.get("ChanceCTxt3"));

                // Avoid error when comparing
                if (moveFields.equals(""))
                    moveFields = "-1";

                second = true;
            } while (Integer.parseInt(moveFields) < 1 || Integer.parseInt(moveFields) > 5);
        }
        else
        {
            // move 1 fields or draw new card
            moveFields = gui.getUserString(lib.text.get("ChanceCTxt4") + " (0)");
            
            boolean second = false;
            
            do {
                if(second)
                    moveFields = gui.getUserString(lib.text.get("ChanceCTxt4") + " (0)");

                // Avoid error when comparing
                if (moveFields.equals(""))
                    moveFields = "-1";

                second = true;
            } while (Integer.parseInt(moveFields) < 0 || Integer.parseInt(moveFields) > 1);
        }

    }

    
}