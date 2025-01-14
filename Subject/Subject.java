/**
 * class: Subject
 * Repersents courses in the Year 2 program
 * Demostrates the use of global variables, constants, naming conventions, and best practies.
 * Author: 
 * Version:
 * Notes:
 *  - Includes attributes for subject details (name, credits, code, lecturer).
 *  - Handles exceptions for invalid values.
 */
//Annotations
public class Subject {
    //attributes
    private String subjectName;
    private int numberOfCredit = 1;
    private int subjectCode;
    private String lecturer; 
    //constants
    private static final int DEFAULT_CREDITS = 3;
    private static final String DEFAULT_LECTURER = "To Be Assigned";
    //constructor
    public Subject(String subjectName, int numberOfCredit, int subjectCode, String lecturer) {
        this.subjectName = subjectName;
        this.subjectCode = subjectCode;
        if (numberOfCredit <= 0) {
            throw new IllegalArgumentException("Number of credits must be greater than zero.");
        }
        this.numberOfCredit = numberOfCredit;
        this.lecturer = (lecturer == null || lecturer.isEmpty()) ? DEFAULT_LECTURER : lecturer;
    }

    //Getter and Setter for subjectName
    public Subject(String subjectName, int subjectCode, String lecturer) {
        this(subjectName, subjectCode, DEFAULT_CREDITS, lecturer);
    }
    public String getSubjectName() {
        return subjectName;
    }
    public void setSubjectName(String subjectName) throws IllegalArgumentException {
        if (subjectName == null || subjectName.trim().isEmpty()) {
            throw new IllegalArgumentException("Please fill the subject name.");
        }
        this.subjectName = subjectName;
    }

    //Getter and Setter for numberOfCredit
    public int getNumberOfCredit() {
        return numberOfCredit;
    }
    public void setNumberOfCredit(int numberOfCredit) throws IllegalArgumentException {
        if (numberOfCredit <= 0) {
            throw new IllegalArgumentException("Number of credits must be greater than zero.");
        }
        this.numberOfCredit = numberOfCredit;
    }

    //Getter and Setter for subjectCode
    public int getSubjectCode(){
        return subjectCode;
    }
    public void setSubjectCode(int subjectCode){
        this.subjectCode = subjectCode;
    }

    //Getter and Setter for lecturer
    public String getLecturer(){
        return lecturer;
    }
    public void setLecturer(String lecturer) {
        this.lecturer =lecturer;
    }
}
