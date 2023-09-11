import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class ServiceTest {
    @Test
    void testAddStudent() {
        var student = new Student();
        student.setRoll(101);
        student.setName("smruti");
        student.setFee(1230.87);

        var service = new Service();
        var result = service.addStudent(student);

        assertEquals(student, result);
    }

    @Test
    void testDeleteStudent() {

    }

    @Test
    void testGetStudent() {

    }

    @Test
    void testGetStudents() {

    }

    @Test
    void testUpdateStudent() {

    }
}
