package BurgerFactory;

public interface Cutlet {
    String toString();
}

class McDonCutlet implements Cutlet {
    public String toString() {
        return "McDonalds Cutlet";
    }
}

class BurgerKingCutlet implements Cutlet {
    public String toString() {
        return "BurgerKing Cutlet";
    }
}
