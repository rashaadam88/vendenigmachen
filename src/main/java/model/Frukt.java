package model;

public class Frukt extends Product {
    public int Fruktnamn;

    public Frukt( String name ,int fruktnamn) {
        Fruktnamn = fruktnamn;
    }

    public int getFruktnamn() {
        return Fruktnamn;
    }
    @Override
    public String examine() {
        return "Name:" + getFruktnamn () + "prise:" + getPrice() + "vikt:" + getFruktnamn();
    }

    public String use() {
        return " Du har köpt en Frukt";
    }
}
    }
}

