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
public class TestStudentLogic {
	Student student = new Student();
	StudentLogic studentLogic = new StudentLogic();
	

	@Before
	public void setUp() throws Exception {
	}

	@Test
    public void testPassingGrade() {
        assertTrue(studentLogic.isPassingGrade(90));
        assertFalse(studentLogic.isPassingGrade(20));
    }

    @Test
    public void testGradeStatus() {
        assertEquals("Pass", studentLogic.getGradeStatus(75));
        assertEquals("Fail", studentLogic.getGradeStatus (25));
    }
   

}
