package ChanceDeck;

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
    public void drawn(Player player) {
        // TODO Player gets to hold this card to get out of prissen
        super.drawn(player);
        
        // player hold card
    }
}