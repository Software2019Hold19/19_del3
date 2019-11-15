package GameBoard;

import ChanceDeck.ChanceDeck;

public class ChanceField extends Field {
    ChanceDeck deck = new ChanceDeck();

    public ChanceField(String name, String type){
        super(name,type);
    }
}
