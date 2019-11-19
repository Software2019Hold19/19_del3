package ChanceDeck;

import GameBoard.GameBoard;
import Main.Player;

/**
 * PlayerChanceCard
 *  Buy field, if field is bought pay the owner
 */
public class PlayerChanceCard extends ChanceCard {

    int fieldInPlay;
    public PlayerChanceCard(String descriptionString, int field) {
        super(descriptionString);
    }

    @Override
    public void drawn(Player player, GameBoard board) {
        // TODO Auto-generated method stub
        super.drawn(player, board);

        // check if field is board and either buy or pay the owner
        
    }
}