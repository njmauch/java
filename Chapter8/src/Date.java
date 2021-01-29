/**
 * Fig. 8.7: Date.java. <br>
 * Date class declaration.
 * 
 * @author Deitel & Associates, Inc.
 */
public class Date {
    /**
     * The month is represented as an int from 1 to 12.
     */
    private int month; // 1-12

    /**
     * The day of the month is an int from 1 to 31.
     */
    private int day; // 1-31 based on month

    /**
     * The year is any int. This will lead to a year 2147483648 bug. Also there
     * could be a year 0 bug.
     */
    private int year; // any year

    /**
     * This is a class constant indicating the number of days for each month
     * from index 1 to index 12. The code will take care of leap years.
     */
    private static final int[] DAYS_PER_MONTH = { 0, 31, 28, 31, 30, 31, 30, 31,
            31, 30, 31, 30, 31 };

    /**
     * constructor: confirm proper value for month and day given the year
     * 
     * @param month
     *            the month
     * @param day
     *            the day of the month
     * @param year
     *            the year
     */
    public Date(int month, int day, int year) {
        // check if month in range
        if (month <= 0 || month > 12)
            throw new IllegalArgumentException(
                    "month (" + month + ") must be 1-12");

        // check if day in range for month
        if (day <= 0
                || (day > DAYS_PER_MONTH[month] && !(month == 2 && day == 29)))
            throw new IllegalArgumentException("day (" + day
                    + ") out-of-range for the specified month and year");

        // check for leap year if month is 2 and day is 29
        if (month == 2 && day == 29
                && !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))
            throw new IllegalArgumentException("day (" + day
                    + ") out-of-range for the specified month and year");

        this.month = month;
        this.day = day;
        this.year = year;

        System.out.printf("Date object constructor for date %s%n", this);
    }

    /**
     * return a String of the form month/day/year
     */
    public String toString() {
        return String.format("%d/%d/%d", month, day, year);
    }
} // end class Date
