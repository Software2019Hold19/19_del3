package Main;

import Main.Controller;
import gui_fields.GUI_Field;
import gui_fields.GUI_Street;
import gui_main.GUI;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        //Controller co = new Controller();
        GUI gui = new GUI();


        for (GUI_Field field : gui.getFields())
            System.out.println(field.toString());
    }
}