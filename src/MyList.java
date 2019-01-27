public interface MyList<E> {
    // needed for ratings problem
    void add(E element);
    E get(int index);
    int size();
}
