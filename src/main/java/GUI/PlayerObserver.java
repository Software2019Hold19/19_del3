package GUI;
import Main.Player;
import gui_fields.GUI_Field;
import gui_fields.GUI_Player;
import gui_main.GUI;

public class PlayerObserver extends Observer{
    //private Player player = new Player("test");

    public PlayerObserver(Player[] pLst){
        super();
        for (Player p : pLst){

        }
    }

   // @Override
    public GUI_Player update(Player p) {
        GUI_Player guiObj = new GUI_Player(p.getName(), p.getBal());
        return guiObj;
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
