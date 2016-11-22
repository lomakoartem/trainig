package creational.prototype;

/**
 * Created by lomak on 22.11.2016.
 */
public class Circle extends Figure {

    public Circle() {
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Inside circle");
    }
}
