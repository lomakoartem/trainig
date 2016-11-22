package creational.builder;

/**
 * Created by lomak on 21.11.2016.
 */
public class MeatPizzaBuilder extends PizzaBuilder{

    @Override
    public void built_pizza_base() {
        pizza.setPizza_base("Meat pizza base");
    }

    @Override
    public void built_pizza_sauce() {
        pizza.setPizza_sauce("Meat pizza sauce");
    }

    @Override
    public void built_pizza_topping() {
        pizza.setPizza_topping("Meat pizza toping");
    }
}
