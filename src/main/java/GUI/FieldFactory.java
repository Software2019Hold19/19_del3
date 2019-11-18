package GUI;

import GameBoard.GameBoard;
import GameBoard.Field;
import gui_fields.GUI_Field;
import gui_fields.GUI_Start;
import gui_fields.GUI_Street;

import java.awt.*;

public class FieldFactory {
    public FieldFactory() {
    }

    public GUI_Field[] boardSetup(GameBoard board){
        GUI_Field[] guiFields = new GUI_Field[24];
        Field[] fields = board.getBoard();
        int i = 0;
        for (Field field : fields){
            String type = field.getType();
            switch(type){
                case ("start"):
                    guiFields[i] = new GUI_Start(field.getName(), field.getSubName(), field.getDesc(), Color.RED, Color.BLACK);

                case ("street"):
                    String[] tmpLst = field.getInfo();
                    Color color = Color.BLACK;
                    switch (tmpLst[5]){
                        case("brown"):
                            color = new Color(127, 76, 25);

                        case("cyan"):
                            color = Color.CYAN;

                        case("magenta"):
                            color = Color.MAGENTA;

                        case("orange"):
                            color = Color.ORANGE;

                        case("red"):
                            color = Color.RED;

                        case("yellow"):
                            color = Color.YELLOW;

                        case("green"):
                            color = Color.GREEN;

                        case("blue"):
                            color = Color.BLUE;

                    }
                    guiFields[i] = new GUI_Street(field.getName(), field.getSubName(), field.getDesc(), tmpLst[4], Color.RED, Color.BLACK);


                case ("visiting"):


                case ("chance"):



                    i++;

            }


        }
        return guiFields;
    }
}
