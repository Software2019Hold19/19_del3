package GameBoard;
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
}
