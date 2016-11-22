package creational.builder;

/**
 * Created by lomak on 21.11.2016.
 */
public abstract class PizzaBuilder {
    Pizza pizza;

    public Pizza getPizza() {
        return pizza;
    }

    public void builtNewPizza(){pizza = new Pizza();}
    public abstract void built_pizza_base();
    public abstract void built_pizza_sauce();
    public abstract void built_pizza_topping();

}
