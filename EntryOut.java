package entry.pkg2.pkg1;

import java.util.Date;

/**
 *
 * @author Lukasz
 */

public class EntryOut {
   private int entryOut;                   //Wydawany nr entry
   private Date dateOut;                //Data wydania entry
   private String usernameOut;          //Nazwa użytkownika wydającego

    public EntryOut(int entryOut, Date dateOut, String usernameOut) {
        this.entryOut = entryOut;
        this.dateOut = dateOut;
        this.usernameOut = usernameOut;
    }

    public int getEntry() {
        return entryOut;
    }

    public void setEntry(int entryOut) {
        this.entryOut = entryOut;
    }

    public Date getDateOut() {
        return dateOut;
    }

    public void setDateOut(Date dateOut) {
        this.dateOut = dateOut;
    }

    public String getUsernameOut() {
        return usernameOut;
    }

    public void setUsernameOut(String usernameOut) {
        this.usernameOut = usernameOut;
    }
    
    
   
}
