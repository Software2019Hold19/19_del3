package GameBoard;

import ChanceDeck.ChanceDeck;
import Main.Player;

public class VisitingField extends Field {

    public VisitingField(String name, String subName, String desc, String type){
        super(name, subName, desc, type);
    }

    @Override
    public void landOnField(Player player, Player[] pLst, ChanceDeck deck, GameBoard board) {
        //just chillin
    }

    @Override
    public String[] getInfo() {
        String[] info = new String[]{getName(), getSubName(), getDesc(), getType()};
        return info;
    }

}
