import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Enumeration;

public class EmployeePayroll {
    /*
     * Method to get list of drivers installed for jdbc connections
     */
    public static void driversList() {
        /*
        An object that implements the Enumeration interface generates a series of elements, one at a time
        it is taking list of drivers one by one
         */
        Enumeration<Driver> driverList = DriverManager.getDrivers();
        System.out.println("List of drivers installed are");
        /*
        Using while loop to print list of drivers using statement has more elements which true if and only
        if this enumeration object contains at least one more element to provide false otherwise.
         */
        while ((driverList.hasMoreElements())) {
            Driver driver = (Driver) driverList.nextElement();
            System.out.println(driver.getClass().getName());
        }
    }


    public static void main(String[] args) {


}

