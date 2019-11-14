package Main;

import Main.Controller;
import gui_main.GUI;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        //Controller co = new Controller();
        GUI gui = new GUI();
        System.out.println(gui.getFields()[10].toString());
        System.out.println(gui.getFields()[30].toString());
    }
}