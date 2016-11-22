package creational.prototype;

/**
 * Created by lomak on 22.11.2016.
 */
public class Rectangle extends Figure {
    public Rectangle() {
    type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside rectangle");
    }
}
