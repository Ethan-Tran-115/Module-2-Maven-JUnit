package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import model.Student;
import model.StudentLogic;
/**
 * @author Phuoc Tran - ptran9@dmacc.edu
 * CIS175 - Spring 2024
 * Jan 16, 2024
 */
public class TestStudent {
	Student student = new Student();
	StudentLogic studentLogic = new StudentLogic();
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
    public void testStudentName() {
        student.setName("Caitlyn");
        assertEquals("Caitlyn", student.getName());
    }
	
	@Test
    public void testNotStudentName() {
        student.setName("Caitlyn");
        assertNotEquals("Nina", student.getName());
    }

    @Test
    public void testStudentGrade() {
        student.setGrade(90);
        assertTrue(student.getGrade() >= 0 && student.getGrade() <= 100);
    }

}
