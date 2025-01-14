public class SubjectMain {
    public static void main(String[] args) {
        // Test 1: Create a new Subject object using the constructor with default credit value
        Subject subject1 = new Subject("Mathematics", 101, "Dr. Smith");
        // Print out the subject details for subject1
        System.out.println("Test 1 - Subject with default credit:");
        System.out.println("Subject Name: " + subject1.getSubjectName());
        System.out.println("Subject Code: " + subject1.getSubjectCode());
        System.out.println("Lecturer: " + subject1.getLecturer());
        System.out.println("Number of Credits: " + subject1.getNumberOfCredit());
        
        // Test 2: Create a Subject object with custom credits
        Subject subject2 = new Subject("Physics", 102, 4, "Dr. Johnson");
        // Print out the subject details for subject2
        System.out.println("\nTest 2 - Subject with custom credit:");
        System.out.println("Subject Name: " + subject2.getSubjectName());
        System.out.println("Subject Code: " + subject2.getSubjectCode());
        System.out.println("Lecturer: " + subject2.getLecturer());
        System.out.println("Number of Credits: " + subject2.getNumberOfCredit());

        // Test 3: Try setting a new subject name (valid input)
        subject1.setSubjectName("Advanced Mathematics");
        System.out.println("\nTest 3 - Update subject name:");
        System.out.println("Updated Subject Name: " + subject1.getSubjectName());

        // Test 4: Try setting an invalid subject name (empty string)
        try {
            subject1.setSubjectName("");
        } catch (IllegalArgumentException e) {
            System.out.println("\nTest 4 - Exception (Invalid Subject Name): " + e.getMessage());
        }

        // Test 5: Try setting a negative credit value
        try {
            subject2.setNumberOfCredit(-3);
        } catch (IllegalArgumentException e) {
            System.out.println("\nTest 5 - Exception (Invalid Number of Credits): " + e.getMessage());
        }
    }
}
