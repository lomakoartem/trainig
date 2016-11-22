package creational.prototype;

/**
 * Created by lomak on 22.11.2016.
 */
public class RunnerPrototype {

        public static void main(String[] args) {
            Prototype.loadCache();

            Figure clonedShape = (Figure) Prototype.getFigure("1");
            System.out.println("Shape : " + clonedShape.getType());

           Figure clonedShape2 = (Figure) Prototype.getFigure("2");
            System.out.println("Shape : " + clonedShape2.getType());

           Figure clonedShape3 = (Figure) Prototype.getFigure("3");
            System.out.println("Shape : " + clonedShape3.getType());

    }
}
