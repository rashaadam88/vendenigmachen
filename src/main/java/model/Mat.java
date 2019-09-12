package model;

    public class Mat extends Product {
        public int vikt;

        public Mat(String name, int price, int vikt) {
            super(name, price);
            this.vikt = vikt;
        }

        public int getVikt() {
            return vikt;
        }

        public String examine() {
            return "Name:" + getName() + "prise:" + getPrice() + "vikt:" + getVikt();
        }

        public String use() {
            return " Du har köpt Mat";
        }
    }