public interface MyList<E> {
    void add(E stu);
    E get(int index);
    void remove(E stu);
    E remove(int index);
    void insert(E stu, int index);
    int indexOf(E stu);
    int size();
}
