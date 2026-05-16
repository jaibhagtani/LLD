package Abstact_Factory;

import Abstact_Factory.dark.DarkTheme;
import Abstact_Factory.dark.DarkThemeFactory;
import Abstact_Factory.light.LightTheme;

public class Client {

    static void main() {
//        only change here
//        Theme dt = new LightTheme();
        Theme dt = new DarkTheme();
        ThemComponentFactory componentFactory = dt.createComponentFactory();

        Button b1 = componentFactory.createButton();
        Menu m1 = componentFactory.createMenu();
    }
}
