public class Course {
    private String major;
    private int number;
    private int section;
    private int capacity;
    private MyList<Student> registered;
    private MyList<Student> waiting;

    public Course(String major, int number, int section, int capacity,
                  MyList<Student> registered, MyList<Student> waiting) {
        this.major = major;
        this.number = number;
        this.section = section;
        this.capacity = capacity;
        this.registered = registered;
        this.waiting = waiting;
    }

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
