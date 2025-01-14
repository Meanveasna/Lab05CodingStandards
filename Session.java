package LAB05;

/**
 * author: Soklang
 * class: StudySession
 * Represents learning sessions scheduled for a specific day.
 * Includes properties for session title, start and finish times, and instructor.
 * Ensures the session duration is valid, verifying that the start time precedes the finish time.
 */
public class Session {
    // Attributes
    private String title;
    private int startHour;
    private int finishHour;
    private String instructor;

    // Constructor
    public Session(String title, int startHour, int finishHour, String instructor) {
        if (startHour >= finishHour) {
            throw new IllegalArgumentException("Start time must be earlier than finish time.");
        }
        this.title = title;
        this.startHour = startHour;
        this.finishHour = finishHour;
        this.instructor = instructor;
    }

    // Getter and Setter for title
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Getter and Setter for startHour and finishHour
    public int getStartHour() {
        return startHour;
    }

    public int getFinishHour() {
        return finishHour;
    }

    public void setTiming(int startHour, int finishHour) throws IllegalArgumentException {
        if (startHour >= finishHour) {
            throw new IllegalArgumentException("Start time must be earlier than finish time.");
        }
        this.startHour = startHour;
        this.finishHour = finishHour;
    }

    // Getter and Setter for instructor
    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    /**
     * Main method to display session information.
     */
    public static void main(String[] args) {
        // Create a new Session object
        Session session = new Session("Mathematics", 9, 11, "Dr. Soklang");

        // Display session information
        System.out.println("Session Title: " + session.getTitle());
        System.out.println("Start Hour: " + session.getStartHour() + ":00");
        System.out.println("Finish Hour: " + session.getFinishHour() + ":00");
        System.out.println("Instructor: " + session.getInstructor());

        // Example of updating session details
        session.setTitle("Advanced Mathematics");
        session.setInstructor("Dr. Princess Lang");
        session.setTiming(10, 12);

        System.out.println("\nUpdated Session Information:");
        System.out.println("Session Title: " + session.getTitle());
        System.out.println("Start Hour: " + session.getStartHour() + ":00");
        System.out.println("Finish Hour: " + session.getFinishHour() + ":00");
        System.out.println("Instructor: " + session.getInstructor());
    }
}
