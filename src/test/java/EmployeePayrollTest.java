import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class EmployeePayrollTest {

    @Test
    /*
    TestCase to check maximum salary employee using getEmployeeWithMaxSalary method
    and save it in arrayList of employeePayrollData.
     */

    public void givenEmpPayrollDB_WhenRetrieved_ShouldGiveMaximumSalaryEmployee() {
        EmployeePayroll employeePayroll = new EmployeePayroll();
        List<Double> employeePayrollData = employeePayroll.getEmployeeWithMaxSalary();
        Assertions.assertEquals(300000.00, employeePayrollData.get(0));
    }

    @Test
    public void givenEmpPayroll_WhenAverageSalaryRetrievedByGender_ShouldReturnProperValue() {
        EmployeePayroll employeePayroll = new EmployeePayroll();
        Map<String, Double> averageSalaryByGender = employeePayroll.averageSalaryByGender();
        Assertions.assertTrue(averageSalaryByGender.get("M").equals(200000.0)
                && averageSalaryByGender.get("F").equals(300000.00));
    }

}