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
    public void remove(E stu) {
        int index = indexOf(stu);
        remove(index);
    }

    @Override
    public E remove(int index) {
        E value = null;
        if(index != -1) {
            value = (E)elements[index];

            System.arraycopy(elements, index+1, elements, index, size-index-1);
            size--;
        }
        return value;
    }

    @Override
    public void insert(E stu, int index) {
        System.arraycopy(elements, index, elements, index+1, size-index);
        elements[index] = stu;
        size++;
    }

    @Override
    public int indexOf(E stu) {
        for(int i=0; i<size; i++) {
            if(elements[i] == stu) {
                return i;
            }
        }
        return -1;

    }

    @Override
    public int size() {
        return size;
    }
}
