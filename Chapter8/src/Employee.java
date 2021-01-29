/**
 * Fig. 8.8: Employee.java <br>
 * Employee class with references to other objects.
 * 
 * @author Deitel & Associates, Inc.
 */
public class Employee {
    /**
     * first name of employee
     */
    private String firstName;
    
    /**
     * last name of employee
     */
    private String lastName;
    
    /**
     * birth date of employee
     */
    private Date birthDate;
    
    /**
     * hire date of employee
     */
    private Date hireDate;

    /**
     * constructor to initialize name, birth date and hire date
     * 
     * @param first
     *            first name of employee
     * @param last
     *            last name of employee
     * @param dateOfBirth
     *            birth date of employee
     * @param dateOfHire
     *            date employee was hired
     */
    public Employee(String first, String last, Date dateOfBirth,
            Date dateOfHire) {
        firstName = first;
        lastName = last;
        birthDate = dateOfBirth;
        hireDate = dateOfHire;
    } // end Employee constructor

    /**
     * convert Employee to String format
     * 
     * @return String represenation of this Employee object
     */
    public String toString() {
        return String.format("%s, %s  Hired: %s  Birthday: %s", lastName,
                firstName, hireDate, birthDate);
    } // end method toEmployeeString
} // end class Employee
