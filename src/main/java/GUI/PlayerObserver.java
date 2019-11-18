package GUI;
import Main.Player;
import gui_fields.GUI_Field;
import gui_fields.GUI_Player;
import gui_main.GUI;

public class PlayerObserver extends Observer{
    //private Player player = new Player("test");
    private GUI_Player[] guiPlayerList;

    public PlayerObserver(Player[] pLst){
        super();

        guiPlayerList = new GUI_Player[pLst.length];

        for (int i = 0; i < pLst.length; i++) {
            guiPlayerList[i] = new GUI_Player(pLst[i].getName(), pLst[i].getBal());
        }
    }

   // @Override
    public GUI_Player update(Player p) {
        GUI_Player guiObj = new GUI_Player(p.getName(), p.getBal());
        return guiObj;
    }

    public GUI_Player[] getGuiPlayerList() {
        return guiPlayerList;
    }



    public void updatePlayerPos(GUI gui, Player[] pLst){
        for (GUI_Field field : gui.getFields()) {
            field.removeAllCars();
        }
        for (Player p : pLst){
           // gui.getFields()[p.getFieldNumber()].setCar();
        }
    }
}
