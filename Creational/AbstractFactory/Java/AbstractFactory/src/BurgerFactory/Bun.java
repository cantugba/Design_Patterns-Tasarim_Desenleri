package BurgerFactory;

public interface Bun {
    String toString();
}

class McDonBun implements Bun {
    public String toString() {
        return "McDonalds Bun";
    }
}

class BurgerKingBun implements Bun {
    public String toString() {
        return "BurgerKing Bun";
    }
}