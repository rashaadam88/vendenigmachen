package model;

public class Dryck extends Product {
    private int volum;

    public Dryck(String name, int price, int volum) {
        super(name, price);
        this.volum = volum;
    }

    public int getVolum() {
        return volum;
    }


}
