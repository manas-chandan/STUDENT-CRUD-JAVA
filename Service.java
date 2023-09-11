import java.util.ArrayList;
import java.util.List;

public class Service {
    private List<Student> students;

    public Service() {
        students = new ArrayList<>();
    }

    public Student addStudent(Student student) {
        students.add(student);
        return student;
    }

    public List<Student> getStudents() {
        return students;
    }

    public Student getStudent(int roll) {
        for (Student student : students) {
            if (student.getRoll() == roll)
                return student;
        }
        return null;
    }

    public void updateStudent(int roll, Student newStudent) {
        for (Student student : students) {
            if (student.getRoll() == roll) {
                student.setFee(newStudent.getFee());
                student.setName(newStudent.getName());
            }
        }
    }

    public void deleteStudent(int roll) {
        students.removeIf(student -> student.getRoll() == roll);
    }
}
