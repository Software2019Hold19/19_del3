package ChanceDeck;

import Main.Player;

/**
 * BankChanceCard
 * either rechive or pay the bank money
 */
public class BankChanceCard extends ChanceCard {

    int changeBalanceBy = 0;

    public BankChanceCard(String descriptionString, int balanceChangeby) {
        super(descriptionString);
        changeBalanceBy = balanceChangeby;
    }

    public int getChangeBalanceBy() {
        return changeBalanceBy;
    }

    @Override
    public void drawn(Player player) {
        super.drawn(player);

        // Change player object balance
        player.addBal(changeBalanceBy);

    }
}