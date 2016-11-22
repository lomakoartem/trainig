package creational.singleton;

/**
 * Created by lomak on 22.11.2016.
 */
public class SingletonVol2 {
    private SingletonVol2 instance = new SingletonVol2();

   private SingletonVol2() {
    }

    public SingletonVol2 getInstance()
    {
        return instance;
    }
}
