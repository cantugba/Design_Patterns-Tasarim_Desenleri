import java.util.Locale;

class PizzaDecoratorTestDrive {
    public static void main(String[] args) {
        Pizza simpleVeganPizza = new Vegan();
        System.out.println(simpleVeganPizza.getDescription() + " $" + formatSum(simpleVeganPizza.cost()));

        Pizza veganPizzaDecor = new Vegan();
        veganPizzaDecor = new Spinach(new Tomato(new Broccoli(veganPizzaDecor)));
        System.out.println(veganPizzaDecor.getDescription() + " $" + formatSum(veganPizzaDecor.cost()));

        Pizza meatPizzaDecor = new MeatHeaven();
        meatPizzaDecor = new Cheese(new Chicken(new Ham(meatPizzaDecor)));
       /* meatPizzaDecor = new Ham(meatPizzaDecor);
        meatPizzaDecor = new Chicken(meatPizzaDecor);
        meatPizzaDecor = new Cheese(meatPizzaDecor); */
        System.out.println(meatPizzaDecor.getDescription() + " $" + formatSum(meatPizzaDecor.cost()));

    }

    private static String formatSum(double sum) {
        return String.format(Locale.ROOT, "%.2f", sum);
    }
}

abstract class Pizza {
    String description;

    String getDescription() {
        return description;
    }

    abstract double cost();
}

class Vegan extends Pizza {

    Vegan() {
        description = "Vegan";
    }

    @Override
    double cost() {
        return 4.99;
    }
}

class MeatHeaven extends Pizza {

    MeatHeaven() {
        description = "MeatHeaven";
    }

    @Override
    double cost() {
        return 4.0;
    }
}

abstract class DecoratorPizza extends Pizza {
    abstract String getDescription();
}

class Ham extends DecoratorPizza {
    private Pizza pizza;

    Ham(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    String getDescription() {
        return pizza.getDescription() + ", Ham";
    }

    @Override
    double cost() {
        return 1.0 + pizza.cost();
    }
}

class Chicken extends DecoratorPizza {

    private Pizza pizza;

    Chicken(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    String getDescription() {
        return pizza.getDescription() + ", Chicken";
    }

    @Override
    double cost() {
        return 1.5 + pizza.cost();
    }
}

class Cheese extends DecoratorPizza {

    private Pizza pizza;

    Cheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    String getDescription() {
        return pizza.getDescription() + ", Cheese";
    }

    @Override
    double cost() {
        return .20 + pizza.cost();
    }
}

class Broccoli extends DecoratorPizza {

    private Pizza pizza;

    Broccoli(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    String getDescription() {
        return pizza.getDescription() + ", Broccoli";
    }

    @Override
    double cost() {
        return .10 + pizza.cost();
    }
}

class Tomato extends DecoratorPizza {

    private Pizza pizza;

    Tomato(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    String getDescription() {
        return pizza.getDescription() + ", Tomato";
    }

    @Override
    double cost() {
        return .09 + pizza.cost();
    }
}

class Spinach extends DecoratorPizza {

    private Pizza pizza;

    Spinach(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    String getDescription() {
        return pizza.getDescription() + ", Spinach";
    }

    @Override
    double cost() {
        return .09 + pizza.cost();
    }
}