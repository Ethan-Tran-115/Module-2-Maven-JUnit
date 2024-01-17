package model;

/**
 * @author Phuoc Tran - ptran9@dmacc.edu
 * CIS175 - Spring 2024
 * Jan 16, 2024
 */
public class StudentLogic {
	public boolean isPassingGrade(int grade) {
        return grade >= 70;
    }
	
	public String getGradeStatus(int grade) {
        if (isPassingGrade(grade)) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

}
