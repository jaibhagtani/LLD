package Abstact_Factory;

//Step 1 - Create parent Class (Absract)
//Step 2 - Create Subclasses from that
//Step 3 - Create Component Factory
//Step 4 - Add factory Method Here (abstract)
public abstract class Theme {
    String color;
    String name;

//    Factory of factories
    public abstract ThemComponentFactory createComponentFactory();
}
