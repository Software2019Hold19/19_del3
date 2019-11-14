package GameBoard;
public class StreetField extends Field {

    private int price;
    private String color;
    //private boolean sold;
    private String owner;

    public StreetField(String name, String type, int price, String color){
        super(name, type);
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
}
