package Abstact_Factory.light;

import Abstact_Factory.Button;
import Abstact_Factory.Menu;
import Abstact_Factory.ThemComponentFactory;

public class LightThemeFactory implements ThemComponentFactory {

    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public Menu createMenu() {
        return new LightMenu();
    }
}
