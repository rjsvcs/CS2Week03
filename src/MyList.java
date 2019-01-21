public interface MyList<E> {
    // needed for ratings problem
    void add(E element);
    E get(int index);
    int size();
    // other list methods
    void remove(E element);
    E remove(int index);
    void insert(E element, int index);
    int indexOf(E element);
}
