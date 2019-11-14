package Main;


public class Player {
    String name;
    private Account acc = new Account();
    int oldFieldNumber = 0;

    public Player (String name){
        this.name = name;

    }

    public int getBal(){
        return acc.getBalance();
    }

    public void addBal(int val){
        acc.addBalance(val);
    }
}
