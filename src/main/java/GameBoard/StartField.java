package GameBoard;

import ChanceDeck.ChanceDeck;
import Main.Player;

public class StartField extends Field {
    private int money = 2;

    public StartField(String name, String subName, String desc, String type){
        super(name, subName, desc,type);
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void landOnField(Player player, Player[] pLst, ChanceDeck deck){
    }

    @Override
    public String[] getInfo(){
        String[] info = new String[]{getName(), getSubName(), getDesc(), getType(), getMoney()+""};
        return info;
    }
}
