package listImpl;

/**
 * Created by lomak on 22.11.2016.
 */
public class LinkedList<E> {

    private static class  Entry<E> {
              E element;
               Entry<E> next;
               Entry<E> previous;

    Entry(E element, Entry<E> next, Entry<E> previous) {
                     this.element = element;
                     this.next = next;
                     this.previous = previous;
                 }
            }

}
