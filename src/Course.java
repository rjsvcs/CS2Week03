public class Course {
    private String major;
    private int number;
    private int section;
    private int capacity;
    private StudentList registered;
    private StudentList waiting;

    public void registerStudent(Student stu) {
        if(stu.getMajor().equals(major) && registered.size() < capacity) {
            registered.add(stu);
        } else {
            waiting.add(stu);
        }
    }

    public void deregisterStudent(Student stu) {
        registered.remove(stu);
        waiting.remove(stu);
    }

    public void moveToFront(Student stu) {
        waiting.remove(stu);
        waiting.insert(stu, 0);
    }

    public void fillClass() {
        while(registered.size() < capacity && waiting.size() > 0) {
            Student stu = waiting.remove(0);
            registered.add(stu);
        }
    }
}
