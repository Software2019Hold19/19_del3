package GUI;
import Main.Player;
import gui_fields.GUI_Player;

public class PlayerObserver extends Observer{
    //private Player player = new Player("test");

    public PlayerObserver(){
        super();
    }

    public PlayerObserver(Player player){
        super();
    }

   // @Override
    public GUI_Player update(Player p) {
        GUI_Player guiObj = new GUI_Player(p.getName());
        return guiObj;
    }
}
