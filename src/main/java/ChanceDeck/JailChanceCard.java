package ChanceDeck;

import javax.swing.text.html.HTMLDocument.BlockElement;

import GameBoard.GameBoard;
import Main.Player;

/**
 * JailChanceCard
 * The player either go to prison or visits it
 */
public class JailChanceCard extends ChanceCard {

    
    public JailChanceCard(String descriptionString) {
        super(descriptionString);

    }

    @Override
    public boolean drawn(Player player, GameBoard board) {
        // TODO Player gets to hold this card to get out of prissen
      //  super.drawn(player, board);
        
        // player hold card
        return false;
    }
}