package GUI;
import Main.Player;
import gui_fields.GUI_Player;

public class PlayerObserver extends Observer{
    //private Player player = new Player("test");

    public PlayerObserver(Player player){
        super();
        GUI_Player guiObj = new GUI_Player(player.getName());

    }

    @Override
    public void update() {
        super.update();
        
    }
}
