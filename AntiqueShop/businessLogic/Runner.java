package businessLogic;

import ui.UserInterface;

public class Runner {
 public static void main(String[] args) {
        UserInterface see = new UserInterface();
        see.showMenu();
        see.readOption();
    }
}
