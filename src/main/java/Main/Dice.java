package Main;

public class Dice {
    private Die die1 = new Die();
    private Die die2 = new Die();

    public Dice(){}

    public int[] roll(){
        int[] vals = new int[2];
        vals[0] = die1.roll();
        vals[1] = die2.roll();
        return vals;
    }

}
