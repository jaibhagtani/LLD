package Abstact_Factory.dark;

import Abstact_Factory.ThemComponentFactory;
import Abstact_Factory.Theme;

public class DarkTheme extends Theme {

    @Override
    public ThemComponentFactory createComponentFactory() {
        return new DarkThemeFactory();
    }
}
