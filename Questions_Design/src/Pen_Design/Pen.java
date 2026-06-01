package Pen_Design;

import Pen_Design.strategies.writestrategies.WriteBehaviour;

public abstract class Pen {
    private String name;
    private String company;
    private Integer price;
    private PenType type;
    private WriteBehaviour writeBehaviour;

//    to set the type of Pen -> Doing by Constructor

    public Pen(PenType penType, WriteBehaviour writeBehaviour)
    {
        this.type = penType;
        this.writeBehaviour = writeBehaviour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public PenType getType() {
        return type;
    }

    public void setType(PenType type) {
        this.type = type;
    }

    public void write()
    {
        this.writeBehaviour.write();
    }

    public abstract Color getColor();
}
