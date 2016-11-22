package creational.prototype;

/**
 * Created by lomak on 22.11.2016.
 */
public class Square extends Figure {
    public Square() {
    type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Inside square");
    }

}
