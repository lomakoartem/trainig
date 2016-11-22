package creational.builder;

/**
 * Created by lomak on 21.11.2016.
 */
public class Waiter {
    private  PizzaBuilder pizzaBuilder;

    public void setPizzaBuilder(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }
    public Pizza getPizza()
    {
        return pizzaBuilder.getPizza();
    }
public void constructPizza()
{
    pizzaBuilder.builtNewPizza();
    pizzaBuilder.built_pizza_base();
    pizzaBuilder.built_pizza_sauce();
    pizzaBuilder.built_pizza_topping();

}
}
