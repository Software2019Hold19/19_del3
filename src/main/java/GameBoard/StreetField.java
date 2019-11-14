package GameBoard;

public class StreetField extends Field {

    private int price;
    private String color;
    private boolean sold;

    public StreetField(String name, int price, String color){
        super(name);
        this.price = price;
        this.color = color;
        sold = false;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public boolean getSold(){
        return sold;
    }

    public void setSold(boolean sold){
        this.sold = sold;
    }
}
