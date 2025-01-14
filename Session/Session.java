/**
 * class: Session
 * Represents study sessions for a day.
 * Includes attributes for session name, start and end time, and lecturer.
 * Provides validation for session duration to ensure start time is earlier than end time.
 */

public class Session {
    //Attributes
    private String sessionName;
    private int startTime;
    private int endTime;
    private String lecturer;
    //constructor
    public Session(String sessionName, int startTime, int endTime, String lecturer){
        if(startTime >= endTime){
            throw new IllegalArgumentException("Start time must be earlier than end time.");
        }
        this.sessionName = sessionName;
        this.startTime = startTime;
        this.endTime = endTime;
        this.lecturer = lecturer;
    }

    // Getter and Setter for sessionName
    public String getSessionName(){
        return sessionName;
    }
    public void setSessionName(String sessionName){
        this.sessionName = sessionName;
    }

    //Getter and Setter for startTime and endTime
    public int getStartTime(){
        return startTime;
    }
    public int getEndTime(){
        return endTime;
    }
    public void setDuration(int startTime, int endTime) throws IllegalArgumentException{
        if(startTime >= endTime){
            throw new IllegalArgumentException("Start time must be earlier than end time.");
        }
        this.startTime = startTime;
        this.endTime = endTime;
    }

    // Getter and Setter for lecturer
    public String getLecturer(){
        return lecturer;
    }
    public void setLecturer(String lecturer){
        this.lecturer = lecturer;
    }
}
