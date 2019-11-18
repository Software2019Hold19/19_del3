package GameBoard;

import ChanceDeck.ChanceDeck;
import Main.Player;

public class StreetField extends Field {

    private int price;
    private String color;
    private String owner;

    public StreetField(String name, String subName, String desc, String type, int price, String color){
        super(name, subName, desc, type);
        this.price = price;
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public String[] getInfo(){
        String[] info = new String[]{getName(), getSubName(), getDesc(), getType(), getPrice()+"", getColor()};
        return info;
    }

    public void landOnField(Player player, Player[] pLst, ChanceDeck deck){
        if (owner.equals(null)){
            owner = player.getName();
            player.addBal(-price);
            //print man køber denne plads for "price"
        }
        else if (player.getName().equals(owner)){
            //print noget med det er dit eget sted
        }
        else{
            for(Player ownercheck : pLst){
                if(ownercheck.getName().equals(owner)){
                    player.addBal(-price);
                    ownercheck.addBal(price);
                }
            }
        }


    }

}
