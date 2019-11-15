package ChanceDeck;

/**
 * ChanceDeck
 * Controls the deck and the cards in it.
 */
public class ChanceDeck {

    ChanceCard deck[] = new ChanceCard[20];
    int cardCount = 0;

    public ChanceDeck() {
        // TODO: Shuffel deck function
        
    }

    public ChanceCard draw() {
        cardCount++;
        return deck[cardCount];
    }
    
}