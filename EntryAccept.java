package entry.pkg2.pkg1;

import java.util.Date;

/**
 *
 * @author Lukasz
 */

public class EntryAccept {
   private int entryAccept;                //Zaakceptowany nr entry
   private Date dateAccept;                //Data zaakceptowania entry
   private String usernameAccept;          //Nazwa użytkownika akceptującego

    public EntryAccept(int entryAccept, Date dateAccept, String usernameAccept) {
        this.entryAccept = entryAccept;
        this.dateAccept = dateAccept;
        this.usernameAccept = usernameAccept;
    }

    public int getEntryAccept() {
        return entryAccept;
    }

    public void setEntryAccept(int entryAccept) {
        this.entryAccept = entryAccept;
    }

    public Date getDateAccept() {
        return dateAccept;
    }

    public void setDateAccept(Date dateAccept) {
        this.dateAccept = dateAccept;
    }

    public String getUsernameAccept() {
        return usernameAccept;
    }

    public void setUsernameAccept(String usernameAccept) {
        this.usernameAccept = usernameAccept;
    }
   
   
}
