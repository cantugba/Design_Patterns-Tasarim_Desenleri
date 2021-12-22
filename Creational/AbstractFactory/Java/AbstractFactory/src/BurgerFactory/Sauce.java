package BurgerFactory;

public interface Sauce {
    String toString();
}

class McDonSauce implements Sauce {
    public String toString() {
        return "McDonalds Sauce";
    }
}

class BurgerKingSauce implements Sauce {
    public String toString() {
        return "BurgerKing Sauce";
    }
}
