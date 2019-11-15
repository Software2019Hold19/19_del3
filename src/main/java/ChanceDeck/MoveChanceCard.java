package ChanceDeck;

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
    public void drawn(Player player) {
        // TODO
        super.drawn(player);
    }

    protected void moveToField(Player player, int tofiled) {
        // move player to field
    }
    
}