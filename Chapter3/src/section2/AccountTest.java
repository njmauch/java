package section2;
import java.util.*;
import java.util.Scanner;

/**
 * Fig. 3.2: AccountTest.java. <br>
 * Creating and manipulating an Account object.
 * 
 * @author Deitel & Associates, Inc.
 */
public class AccountTest {
    /**
     * Main method begins program execution.
     */
	public static void main(String[] args) {
		ArrayList groceryList = new ArrayList(); 
		groceryList.add("milk");

		groceryList.add("eggs");

		groceryList.add("bread");

		groceryList.add("carrots");

		groceryList.remove(2);

		groceryList.remove("carrots");

		System.out.println( groceryList.size() );

    }
} // end class AccountTest
