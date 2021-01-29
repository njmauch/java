package section2;

/**
 * Fig. 3.1: Account.java. <br>
 * Account class that contains a name field and methods to set and
 * get its value.
 * 
 * @author Deitel & Associates, Inc.
 */
public class Account {
    /**
     * Stores the name of the account.
     */
    private String name; // field

    /**
     * method to set the name in the object
     * @param name the new name of the account
     */
    public void setName(String name) {
        this.name = name; // store the name
    }

    /**
     * method to retrieve the name from the object
     * @return the name of the account
     */
    public String getName() {
        return name; // return value of name to caller
    }
} // end class Account
