package BurgerFactory;

public abstract class Burger {
    static final String CHEESE = "cheese";
    static final String HAMBURGER = "hamburger";
    static final String VEGAN = "vegan";

    String box;
    String name;
    Bun bun;
    Cutlet cutlet;
    Sauce sauce;
    Cheese cheese;

    abstract void collect();

    void box() {
        if (box != null) {
            System.out.println("Placing in official " + box);
        } else {
            System.out.println("Placing in official BurgerStore box");
        }
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    void setBox(String box) {
        this.box = box;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("---- ").append(name).append(" ----\n");
        if (bun != null) {
            result.append(bun);
            result.append("\n");
        }
        if (cutlet != null) {
            result.append(cutlet);
            result.append("\n");
        }
        if (sauce != null) {
            result.append(sauce);
            result.append("\n");
        }
        if (cheese != null) {
            result.append(cheese);
            result.append("\n");
        }
        return result.toString();
    }
}

class Cheeseburger extends Burger {
    BurgerIngredientFactory ingredientFactory;

    Cheeseburger(BurgerIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    void collect() {
        System.out.println("Collecting " + name);
        bun = ingredientFactory.createBun();
        cheese = ingredientFactory.createCheese();
        cutlet = ingredientFactory.createCutlet();
        sauce = ingredientFactory.createSauce();
    }
}

class Hamburger extends Burger {
    BurgerIngredientFactory ingredientFactory;

    Hamburger(BurgerIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    void collect() {
        System.out.println("Collecting " + name);
        bun = ingredientFactory.createBun();
        cutlet = ingredientFactory.createCutlet();
        sauce = ingredientFactory.createSauce();
    }
}

class VeganBurger extends Burger {
    BurgerIngredientFactory ingredientFactory;

    VeganBurger(BurgerIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    void collect() {
        System.out.println("Collecting " + name);
        bun = ingredientFactory.createBun();
        sauce = ingredientFactory.createSauce();
    }
}