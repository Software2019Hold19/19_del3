package ChanceDeck;

import Main.Player;

/**
 * ChoiceMoveChanceCard
 * (Move up to 5 fields) new car (1 field or take new chancecard)
 */
public class ChoiceMoveChanceCard extends MoveChanceCard {

    boolean moveUpToFiveFields;
    public ChoiceMoveChanceCard(String descriptionString, boolean moveFivefieldsCard) {
        super(descriptionString);
        moveUpToFiveFields = moveFivefieldsCard;
    }

    @Override
    public void drawn(Player player) {
        // TODO Make player chose beween up to 5 filed or draw new card
        super.drawn(player);

        // Move (1-5 field) or card if 0 draw new card
        if (moveUpToFiveFields) {
            // Chose number of fields player want to move
        }
        else {
            // choose to draw new card or move 1 field
        }
    }
    
}