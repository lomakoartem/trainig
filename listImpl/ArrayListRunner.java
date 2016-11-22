package listImpl;

/**
 * Created by lomak on 22.11.2016.
 */
public class ArrayListRunner {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("Test");
        arrayList.add("Test1");
        arrayList.add("Test2");
        arrayList.add("Test3");
        arrayList.remove(0);
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.size());
        System.out.println(arrayList.contains("Test3"));
    }
}
