package GUI;

import GameBoard.Field;
import gui_fields.GUI_Field;

public class BoardObserver extends Observer {

    public BoardObserver() {

    }

    public void ownerUpdate(GUI_Field[] guiFields, Field[] fields){
        for (int i = 0; i < fields.length; i++){
            if (fields[i].getInfo()[3].equals("street")){
                String owner = fields[i].getInfo()[6];
                if (!owner.equals("")){
                    guiFields[i].setDescription(fields[i].getDesc() + "\nOwner: " + owner);
                }
            }
        }
    }
}
