package eagleplan;

import java.sql.Date;

public class Slot {

    private int ID;
    private String Fleet;
    private String Location;
    private String SimRegistration;
    private Date Date;
    private String Candidate1;
    private String Candidate2;
    private String TrainingType;
    private String Instructor1;
    private String Instructor2;
    private String Observer1;
    private int Version;
    private Date ModifiedDate;
    private Boolean Confirmed;
    private Boolean Completed;

    public Slot(int ID, String Fleet, String Location, String SimRegistration, Date Date,
            String Candidate1, String Candidate2, String TrainingType, String Instructor1,
            String Instructor2, String Observer1, int Version, Date ModifiedDate, Boolean Confirmed,
            Boolean Completed) 
    {
        this.ID = ID;
        this.Fleet = Fleet;
        this.Location = Location;
        this.SimRegistration = SimRegistration;
        this.Date = Date;
        this.Candidate1 = Candidate1;
        this.Candidate2 = Candidate2;
        this.TrainingType = TrainingType;
        this.Instructor1 = Instructor1;
        this.Instructor2 = Instructor2;
        this.Observer1 = Observer1;
        this.Version = Version;
        this.ModifiedDate = ModifiedDate;
        this.Confirmed = Confirmed;
        this.Completed = Completed;
    }

    public int getID() {
        return ID;
    }

    public String getFleet() {
        return Fleet;
    }
    
    public String getLocation() {
        return Location;
    }

    public String getSimRegistration() {
        return SimRegistration;
    }
    
    public Date getDate() {
        return Date;
    }
    
    public String getCandidate1() {
        return Candidate1;
    }
    
    public String getCandidate2() {
        return Candidate2;
    }
    
    public String getTrainingType() {
        return TrainingType;
    }
    
    public String getInstructor1() {
        return Instructor1;
    }
    
    public String getInstructor2() {
        return Instructor2;
    }
    
    public String getObserver1() {
        return Observer1;
    }
    
    public int getVersion() {
        return Version;
    }
    
    public Date getModifiedDate () {
        return ModifiedDate;
    }
    
    public Boolean getConfirmed () {
        return Confirmed;
    }
    
    public Boolean getCompleted () {
        return Completed;
    }
    
}

