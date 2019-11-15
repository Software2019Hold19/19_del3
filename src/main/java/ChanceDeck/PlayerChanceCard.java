package ChanceDeck;

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
    public void drawn(Player player) {
        // TODO Auto-generated method stub
        super.drawn(player);

        // check if field is board and either buy or pay the owner
        
    }
}