package creational.singleton;

/**
 * Created by lomak on 22.11.2016.
 */
public class SingletonBillPugh {
    private SingletonBillPugh()
    {

    }
    private static class  SingletonHolder
    {
       public static final SingletonBillPugh instance = new SingletonBillPugh();
    }

    public SingletonBillPugh getInstance()
    {
        return SingletonHolder.instance;
    }
}
