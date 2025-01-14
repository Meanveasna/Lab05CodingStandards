package LAB05;
import LAB05.Subject;
/**
 * class Subject
 * @author LANG
 * version 1.0.0
 * modified 10/01/2025
 */
public class Subject {
    public static final double Price = 100.15;
    private String subjectname;
    private int subjectcode;
    private int numberOfCredit = 1;

    public Subject(String subjectname, int subjectcode, int numberOfCredit) {
        super();
        this.subjectname = subjectname;
        this.subjectcode = subjectcode;
        this.numberOfCredit = numberOfCredit;
    }

    public String getSubjectname() {
        return subjectname;
    }

    public void setSubjectname(String subjectname) throws IllegalArgumentException {
        if (subjectname == null || subjectname.trim().isEmpty()) {
            throw new IllegalArgumentException("Subject name cannot be null or empty.");
        }
        this.subjectname = subjectname;
    }

    public int getSubjectcode() {
        return subjectcode;
    }

    public void setSubjectcode(int subjectcode) {
        if (subjectcode <= 0) {
            throw new IllegalArgumentException("Subject code must be a positive integer.");
        }
        this.subjectcode = subjectcode;
    }

    public int getNumberOfCredit() {
        return numberOfCredit;
    }

    public void setNumberOfCredit(int numberOfCredit) {
        if (numberOfCredit <= 0) {
            throw new IllegalArgumentException("Number of credits must be a positive integer.");
        }
        this.numberOfCredit = numberOfCredit;
    }

    public static double getPrice() {
        return Price;
    }

    public static void main(String[] args) {
        try {
            Subject Mysubject = new Subject("Programming", 20240007, 2);
            System.out.println("Subject Name: " + Mysubject.getSubjectname());
            System.out.println("Subject Code: " + Mysubject.getSubjectcode());
            System.out.println("Number of Credits: " + Mysubject.getNumberOfCredit());
            System.out.println("Price: $" + Subject.getPrice());
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
