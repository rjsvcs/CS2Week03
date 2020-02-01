package lecture;

public class Student {
    private String email;
    private String password;
    private MyList<Professor> professors;

    public Student(String email, String password,
                   MyList<Professor> professors) {
        this.email = email;
        this.password = password;
        this.professors = professors;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void addProfessor(Professor prof) {
        professors.add(prof);
    }
}
