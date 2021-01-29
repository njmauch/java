package section5;

/**
 * Fig. 3.8: Account.java. <br>
 * Account class with a name field, a balance field, a constructor, and a
 * deposit method that perform validation.
 * 
 * @author Deitel & Associates, Inc.
 */

public class Account {
    /**
     * Stores the name of the account.
     */
    private String name; // field

    /**
     * Stores the balance of the account.
     */
    private double balance; // field

    /**
     * Account constructor that receives two parameters
     * 
     * @param name
     *            to initialize the name field
     * @param balance
     *            to initialize the balance field
     */
    public Account(String name, double balance) {
        this.name = name; // assign name to the name field

        // validate that the balance is greater than 0.0; if it's not,
        // the balance field keeps its default initial value of 0.0
        if (balance > 0.0) // if the balance is valid
            this.balance = balance; // assign it to the balance field
    }

    /**
     * method that deposits (adds) only a valid amount to the balance
     * 
     * @param depositAmount
     *            amount to add to the balance
     */
    public void deposit(double depositAmount) {
        if (depositAmount > 0.0) // if the depositAmount is valid
            balance = balance + depositAmount; // add it to the balance
    }

    /**
     * method returns the account balance
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * method that sets the name
     * @param name the new name for the name field
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * method that returns the name
     * @return the name
     */
    public String getName() {
        return name;
    }
} // end class Account
