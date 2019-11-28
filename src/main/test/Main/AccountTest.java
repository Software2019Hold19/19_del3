package Main;

import GUI.PlayerObserver;
import org.junit.Test;

import static org.junit.Assert.*;

public class AccountTest {
    Player[] list = new Player[]{};
    Account acc = new Account();
    PlayerObserver playerOb = new PlayerObserver(list);

    @Test
    public void addBalance() {
        acc.addBalance(5);
    }
}