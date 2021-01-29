package section4;

/**
 * Fig. 3.6: AccountTest.java. <br>
 * Using the Account constructor to initialize the name field at the time each
 * Account object is created.
 * 
 * @author Deitel & Associates, Inc.
 */

public class AccountTest {
    /**
     * Main method begins program execution.
     */
    public static void main(String[] args) {
        // create two Account objects
        Account account1 = new Account("Jane Green");
        Account account2 = new Account("John Blue");

        // display initial value of name for each Account
        System.out.printf("account1 name is: %s%n", account1.getName());
        System.out.printf("account2 name is: %s%n", account2.getName());
    }
} // end class AccountTest
