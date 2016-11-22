package creational.builder;

/**
 * Created by lomak on 21.11.2016.
 */
public class Pizza {

    String pizza_base;
    String pizza_sauce;
    String pizza_topping;

    public String getPizza_base() {
        return pizza_base;
    }

    public void setPizza_base(String pizza_base) {
        this.pizza_base = pizza_base;
    }

    public String getPizza_sauce() {
        return pizza_sauce;
    }

    public void setPizza_sauce(String pizza_sauce) {
        this.pizza_sauce = pizza_sauce;
    }

    public String getPizza_topping() {
        return pizza_topping;
    }

    public void setPizza_topping(String pizza_topping) {
        this.pizza_topping = pizza_topping;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "pizza_base='" + pizza_base + '\'' +
                ", pizza_sauce='" + pizza_sauce + '\'' +
                ", pizza_topping='" + pizza_topping + '\'' +
                '}';
    }
}
