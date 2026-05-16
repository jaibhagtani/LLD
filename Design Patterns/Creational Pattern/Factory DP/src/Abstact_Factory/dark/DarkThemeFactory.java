package Abstact_Factory.dark;

import Abstact_Factory.Button;
import Abstact_Factory.Menu;
import Abstact_Factory.ThemComponentFactory;

public class DarkThemeFactory implements ThemComponentFactory {

    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public Menu createMenu() {
        return new DarkMenu();
    }
}
