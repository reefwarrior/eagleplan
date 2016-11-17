package eagleplan;

import java.sql.Date;

public class Pairing {

    private int ID;
    private int Slot1;
    private int Slot2;
    private Boolean Completed;
  
    public Pairing(int Pair_ID, int Slot1, int Slot2, Boolean Complete) {
        this.ID = ID;
        this.Slot1 = Slot1;
        this.Slot2 = Slot2;
        this.Completed = Completed;
        
    }

    public int getID() {
        return ID;
    }

    public int getSlot1() {
        return Slot1;
    }

    public int getSlot2() {
        return Slot2;
    }

    public Boolean getCompleted() {
        return Completed;
    }

    
}
