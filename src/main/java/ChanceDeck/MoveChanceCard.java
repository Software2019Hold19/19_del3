package ChanceDeck;

import GameBoard.GameBoard;
import Main.Player;

/**
 * MoveChanceCard
 * Based class for all cards that can move a player
 */
public class MoveChanceCard extends ChanceCard {

    public MoveChanceCard(String descriptionString) {
        super(descriptionString);
    }

    @Override
    public void drawn(Player player, GameBoard board) {
        // TODO
        super.drawn(player, board);
    }

    protected void moveToField(Player player, int toField) {
        // move player to field
    }
    
}