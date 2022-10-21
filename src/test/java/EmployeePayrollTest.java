import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;


import static org.junit.jupiter.api.Assertions.*;

class EmployeePayrollTest {


    @Test
    public void givenNewEmp_WhenAdded_ShouldSyncWithDb() {
        EmployeePayroll employeePayroll = new EmployeePayroll();
        employeePayroll.addEmployeeToEmployeePayroll("Mark", "M", 500000, LocalDate.now());
        boolean result = employeePayroll.checkEmployeePayrollInSyncWithDb("Mark");
        Assertions.assertTrue(result);
    }

}