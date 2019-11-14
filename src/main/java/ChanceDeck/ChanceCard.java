package ChanceDeck;

import Main.Player;

/**
 * ChanceCard
 *  Base class for all chance cards in the game
 */
public class ChanceCard {

    protected boolean isInUse = false;
    String description = "";

    public ChanceCard(String descriptionString) {
        description = descriptionString;
    }

    public void drawn(Player player) {
        
    }

    public boolean getIsInUse() {
        return isInUse;
    }

    public void setIsInUse(boolean inUse) {
        isInUse = inUse;
    }
    
}