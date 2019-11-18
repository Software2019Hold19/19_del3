package GameBoard;

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

    public int landOnField(int bal){
        bal += this.money;
        return bal;
    }

    @Override
    public String[] getInfo(){
        String[] info = new String[]{getName(), getSubName(), getDesc(), getType(), getMoney()+""};
        return info;
    }
}
