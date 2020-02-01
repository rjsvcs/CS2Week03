package lecture;

import java.util.Arrays;

public class MyArrayList<E> implements MyList<E> {
    private Object[] elements;
    private int size;

    public MyArrayList(int capacity) {
        elements = new Object[capacity];
        size = 0;
    }

    @Override
    public void add(E stu) {
        if(size == elements.length) {
            elements = Arrays.copyOf(elements, size*2);
        }
        elements[size] = stu;
        size++;
    }

    @Override
    public E get(int index) {
        return (E)elements[index];
    }

    @Override
    public int size() {
        return size;
    }
}
