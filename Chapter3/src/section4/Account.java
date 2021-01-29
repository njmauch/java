package section4;

/**
 * Fig. 3.5: Account.java. <br>
 * Account class with a constructor that initializes the name.
 * 
 * @author Deitel & Associates, Inc.
 */

public class Account {
    /**
     * Stores the name of the account.
     */
    private String name; // field

    /**
     * constructor initializes the name field with the name parameter
     * @param name to initialize the name of the account
     */
    public Account(String name) { // constructor name is class name
        this.name = name;
    }

    /**
     * method to set the name
     * @param name the new name of the account
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * method to retrieve the name
     * @return the name of the account
     */
    public String getName() {
        return name;
    }
} // end class Account
