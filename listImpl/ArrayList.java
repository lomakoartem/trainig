package listImpl;

import java.util.AbstractList;

/**
 * Created by lomak on 22.11.2016.
 */
public class ArrayList<E> extends AbstractList<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private  int size;

    private E data [];

    public ArrayList(int capacity) {
       if (capacity < 0)
           throw new IllegalArgumentException();
        data = (E[]) new Object[DEFAULT_CAPACITY];

    }

    public ArrayList() {
        this(DEFAULT_CAPACITY);
    }

    public void ensureCapacity(int minCapacity)
    {
        int currentLength = data.length;
        if (minCapacity > currentLength)
        {
            E[] newData = (E[]) new Object[Math.max(currentLength * 2, minCapacity)];
              System.arraycopy(data, 0, newData, 0, size);
                data = newData;
             }
      }
    public int size()
   {
          return size;
    }
    public boolean isEmpty()
  {
       return size == 0;
  }
public E get(int index)
{
    checkBoundExclusive(index);
    return data[index];
}

public boolean add(E object)
{

         if (size == data.length)
          ensureCapacity(size + 1);
        data[size++] = object;
         return true;
}

    public int indexOf(Object e)
   {
             for (int i = 0; i < size; i++)
                 if (e.equals(data[i]))
                     return i;
          return -1;
          }


    public boolean contains(Object e)
        {
          return indexOf(e) != -1;
        }
    public E remove(int index)
  {
          checkBoundExclusive(index);
            E r = data[index];
                      if (index != --size)
              System.arraycopy(data, index + 1, data, index, size - index);
         data[size] = null;
          return r;
         }
    private void checkBoundExclusive(int index)
    {
        if (index >= size)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: "
                    + size);
    }
}



