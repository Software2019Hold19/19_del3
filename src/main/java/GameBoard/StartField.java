package GameBoard;

public class StartField extends Field {
    private int money = 2;

    public StartField(String name){
        super(name);
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public int landOnField(int bal){
        bal += this.money;
        return bal;
    }
}
