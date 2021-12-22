package BurgerFactory;

public interface BurgerIngredientFactory {
    Bun createBun();
    Cheese createCheese();
    Cutlet createCutlet();
    Sauce createSauce();
}

class McDonIngredientFactory implements BurgerIngredientFactory {
    @Override
    public Bun createBun() {
        return new McDonBun();
    }

    @Override
    public Cheese createCheese() {
        return new McDonCheese();
    }

    @Override
    public Cutlet createCutlet() {
        return new McDonCutlet();
    }

    @Override
    public Sauce createSauce() {
        return new McDonSauce();
    }
}

class BurgerKingIngredientFactory implements BurgerIngredientFactory {
    @Override
    public Bun createBun() {
        return new BurgerKingBun();
    }

    @Override
    public Cheese createCheese() {
        return new BurgerKingCheese();
    }

    @Override
    public Cutlet createCutlet() {
        return new BurgerKingCutlet();
    }

    @Override
    public Sauce createSauce() {
        return new BurgerKingSauce();
    }
}