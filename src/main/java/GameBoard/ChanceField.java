package GameBoard;

import ChanceDeck.ChanceDeck;

public class ChanceField extends Field {
    ChanceDeck deck = new ChanceDeck();

    public ChanceField(String name, String subName, String desc, String type){
        super(name, subName, desc, type);
    }
}
