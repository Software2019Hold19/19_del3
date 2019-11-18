package GameBoard;

import ChanceDeck.ChanceDeck;
import Main.Player;

public class VisitingField extends Field {

    public VisitingField(String name, String subName, String desc, String type){
        super(name, subName, desc, type);
    }

    public void landOnField(Player player, Player[] pLst, ChanceDeck deck) {
        //just chillin
    }

    @Override
    public String[] getInfo() {
        String[] info = new String[]{getName(), getSubName(), getDesc(), getType()};
        return info;
    }

}
