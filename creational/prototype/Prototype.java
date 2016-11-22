package creational.prototype;

import java.util.Hashtable;

/**
 * Created by lomak on 22.11.2016.
 */
public class Prototype {
    private static Hashtable<String, Figure> prototypeFigureMap =
            new Hashtable<String,Figure>();

    public static Figure getFigure(String id)
    {
        Figure figure = prototypeFigureMap.get(id);
   return (Figure) figure.clone();
}
    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        prototypeFigureMap.put(circle.getId(),circle);

        Square square = new Square();
        square.setId("2");
         prototypeFigureMap.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        prototypeFigureMap.put(rectangle.getId(), rectangle);
    }
}
