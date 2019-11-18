package ChanceDeck;

/**
 * ChanceDeck
 * Controls the deck and the cards in it.
 */
public class ChanceDeck {

    ChanceCard deck[] = new ChanceCard[2];
    int cardCount = 0;

    public ChanceDeck() {
        // TODO: Shuffel deck function
        deck[0] = new BankChanceCard("Få 2 penge", 2);
        deck[1] = new BankChanceCard("Du minster 2 kort til banken", -2);
    }

    public ChanceCard draw() {
        cardCount++;
        return deck[cardCount];
    }
    
}