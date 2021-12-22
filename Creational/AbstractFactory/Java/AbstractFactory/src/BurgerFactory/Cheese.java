package BurgerFactory;

public interface Cheese {
    String toString();
}

class McDonCheese implements Cheese {
    public String toString() {
        return "McDonalds Cheese";
    }
}

class BurgerKingCheese implements Cheese {
    public String toString() {
        return "BurgerKing Cheese";
    }
}