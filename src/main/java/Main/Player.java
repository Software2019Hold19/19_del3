package Main;


public class Player {
    String name;
    private Account acc = new Account();
    int fieldNumber = 0;

    public Player (String name){
        this.name = name;

    }

    public void blink(int pos){ // move directly to pos
        this.fieldNumber = pos;
    }

    public String getName(){
        return this.name;
    }

    public int getBal(){
        return acc.getBalance();
    }

    public void addBal(int val){
        acc.addBalance(val);
    }
}
