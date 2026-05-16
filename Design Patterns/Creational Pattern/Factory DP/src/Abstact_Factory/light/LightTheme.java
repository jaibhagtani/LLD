package Abstact_Factory.light;

import Abstact_Factory.ThemComponentFactory;
import Abstact_Factory.Theme;

public class LightTheme extends Theme {

    @Override
    public ThemComponentFactory createComponentFactory() {
        return new LightThemeFactory();
    }
}
