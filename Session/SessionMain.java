public class SessionMain {
    public static void main(String[] args) {
        // Test 1: Create a new Session object with valid start and end times
        Session session1 = new Session("Math Lecture", 9, 11, "Dr. Smith");
        // Print out the session details for session1
        System.out.println("Test 1 - Valid session:");
        System.out.println("Session Name: " + session1.getSessionName());
        System.out.println("Start Time: " + session1.getStartTime());
        System.out.println("End Time: " + session1.getEndTime());
        System.out.println("Lecturer: " + session1.getLecturer());

        // Test 2: Try to create a session with invalid times (start time >= end time)
        try {
            Session session2 = new Session("Physics Lecture", 14, 13, "Dr. Johnson");
        } catch (IllegalArgumentException e) {
            System.out.println("\nTest 2 - Exception (Invalid Time): " + e.getMessage());
        }

        // Test 3: Update session duration with valid new times
        session1.setDuration(10, 12);
        System.out.println("\nTest 3 - Updated session duration:");
        System.out.println("Updated Start Time: " + session1.getStartTime());
        System.out.println("Updated End Time: " + session1.getEndTime());

        // Test 4: Try to set an invalid duration (start time >= end time)
        try {
            session1.setDuration(13, 12);
        } catch (IllegalArgumentException e) {
            System.out.println("\nTest 4 - Exception (Invalid Duration): " + e.getMessage());
        }

        // Test 5: Update the session name and lecturer
        session1.setSessionName("Advanced Math Lecture");
        session1.setLecturer("Dr. Williams");
        System.out.println("\nTest 5 - Updated session details:");
        System.out.println("Updated Session Name: " + session1.getSessionName());
        System.out.println("Updated Lecturer: " + session1.getLecturer());
    }
}
