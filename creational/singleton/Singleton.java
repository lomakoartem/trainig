package creational.singleton;

/**
 * Created by lomak on 22.11.2016.
 */
public class Singleton {
    private Singleton instance;

    private Singleton() {
    }

    public Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return new Singleton();
    }
}
