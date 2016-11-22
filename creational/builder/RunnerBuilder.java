package creational.builder;

/**
 * Created by lomak on 21.11.2016.
 */
public class RunnerBuilder {

    public static void main(String[] args) {
Waiter waiter = new Waiter();
        PizzaBuilder seaPizzaBuilder = new SeaPizzaBuilder();
        PizzaBuilder margoPizzaBuilder = new MargaritaPizzaBuilder();
        PizzaBuilder meatPizzaBuilder = new MeatPizzaBuilder();
        waiter.setPizzaBuilder(seaPizzaBuilder);
        waiter.constructPizza();
        Pizza pizza = waiter.getPizza();
        System.out.println(pizza.toString());
    }
}
