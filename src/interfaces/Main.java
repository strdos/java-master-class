package interfaces;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Player gnome = new Player("Gnome", 20, 50);
        System.out.println(gnome.toString());

        Monster werewolf = new Monster("Werewolf", 30, 50);
        System.out.println(werewolf.toString());

    }
}
