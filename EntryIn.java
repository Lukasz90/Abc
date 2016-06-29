package entry.pkg2.pkg1;

import java.util.Date;

/**
 *
 * @author Lukasz
 */

public class EntryIn {
   private int entryIn;                   //Zwrócony nr entry
   private Date dateIn;                //Data Powrotu entry
   private String usernameIn;          //Nazwa użytkownika Zwracającego
   
    public EntryIn(int entryIn, Date dateIn, String usernameIn) {
        this.entryIn = entryIn;
        this.dateIn = dateIn;
        this.usernameIn = usernameIn;
    }

    public int getEntryIn() {
        return entryIn;
    }

    public void setEntryIn(int entryIn) {
        this.entryIn = entryIn;
    }

    public Date getDateIn() {
        return dateIn;
    }

    public void setDateIn(Date dateIn) {
        this.dateIn = dateIn;
    }

    public String getUsernameIn() {
        return usernameIn;
    }

    public void setUsernameIn(String usernameIn) {
        this.usernameIn = usernameIn;
    }

   
   
}
