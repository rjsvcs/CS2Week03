public interface StudentList {
    void add(Student stu);
    Student get(int index);
    void remove(Student stu);
    Student remove(int index);
    void insert(Student stu, int index);
    int indexOf(Student stu);
    int size();
}
