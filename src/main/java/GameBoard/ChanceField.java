package GameBoard;

import ChanceDeck.ChanceDeck;
import Main.Player;

public class ChanceField extends Field {

    public ChanceField(String name, String subName, String desc, String type){
        super(name, subName, desc, type);
    }

    @Override
    public void landOnField(Player player, Player[] pLst, ChanceDeck deck){
        deck.draw().drawn(player);
    }

    @Override
    public String[] getInfo() {
        String[] info = new String[]{getName(), getSubName(), getDesc(), getType()};
        return info;
    }
}
