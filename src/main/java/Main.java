import gui_fields.GUI_Field;
import gui_fields.GUI_Street;
import gui_main.GUI;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        GUI_Field[] fields = new GUI_Field[24];
        for (int i = 0; i < 24; i++){
           /* GUI_Street test = new GUI_Street("Test" + i, "SubTest" + i, "describtionTest" + i){};
            test.setTitle("Test" + i);
            test.setDescription("describtionTest" + i);
            fields[i] = test;*/
        }

        Translator lib = new Translator();

        System.out.println(lib.text.get("Field1"));

        GUI gui = new GUI(fields);
    }
}
