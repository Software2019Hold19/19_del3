package ChanceDeck;

import java.util.Random;

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

        shuffleDeck();
        
    }

    public void shuffleDeck(){
        /* shuffles the deck of chancecards
        - creates copy of deck (cardlist) and makes boolean array in same size.
        - each index in the deck is filled with a random card from cardlist
        - when a card is grabbed from the list it is marked as taken ("true")
        - if card is alreaddy grabbed from list a new number is gererated until a free card is found.*/
        java.util.Random random = new java.util.Random();
        boolean[] cardTaken = new boolean[deck.length];

        ChanceCard[] cardList = new ChanceCard[deck.length];
        for(int i = 0; i < deck.length; i++){ //makes sure cardlist points to the cards and not the array of cards...
            cardList[i] = deck[i];
            cardTaken[i] = false;
        }

        int nummer = random.nextInt(deck.length);
        for(int i = 0; i < deck.length; i++){
            while(cardTaken[nummer] == true){
                nummer = random.nextInt(deck.length);
            }
            deck[i] = cardList[nummer];
            cardTaken[nummer] = true;
        }
    }

    public ChanceCard draw() {
        if (cardCount >= deck.length){ //makes resets count when all cards have been drawn
            cardCount = 0;
        }
        return deck[cardCount++];//returns drawn card and THEN adds 1 to cardCount
    }
    
}