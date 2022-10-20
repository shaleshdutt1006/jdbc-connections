# JDBC Connections






UseCase1-Ability to create a payroll service
database and have java program
connect to database
- Use the payroll_service database created in MySQL
- Download and register the jdbc driver jar to your Build
Path in Eclipse
- Alternatively use Maven or Gradle to add jdbc driver to
your project
- Check if the Driver Class is available for the java
program
- Check all the drivers registered with the jdbc driver
- Check if the database connection to payroll_service
mysql DB is established 







UseCase2-Ability for Employee Payroll
Service to retrieve the Employee
Payroll from the Database
- Using JDBC read the employee payroll data from the
database
- Add Start Data to EmployeePayroll Class and ensure
backward compatibility
- Populate the EmployeePayroll Object
- Return the list of Employee Payroll Data
- Any Error throw Custom Exceptions







UseCase3-Ability to update the salary i.e.
the base pay for Employee
Terisa to 3000000.00 and sync it
with Database
- Update the employee payroll in the database
- Update the Employee Payroll Object with the Updated
Salary
- Compare Employee Payroll Object with DB to pass the
Junit Test.
- Any Error throw Custom Exceptions








UseCase4-Ability to update the salary i.e. the
base pay for Employee Terisa to
3000000.00 and sync it with Database
using JDBC PreparedStatement - Update the employee payroll in the database - Update the Employee Payroll Object with the Updated
Salary
- Compare Employee Payroll Object with DB to pass the
Junit Test
.
- Any Error throw Custom Exceptions











Refactor4-Refactor Code to do the
following
- Create PreparedStatement to retrieve payroll data by
name
- Cache the PreparedStatement at the Driver and DB
Level
- Make Payroll DB Service Object as Singleton so
PreparedStatement is cached in the Program
- Reuse the ResultSet to populate EmployeePayrollData
Object











UseCase5-Ability to retrieve all
employees who have
joined in a particular
data range from the
payroll service
database








UseCase6-Ability to find sum, average, min, max
and number of male and female
employees
- Use Database Function SUM, AVG, MIN, MAX, COUNT
to do analysis by Male and Female.
- Note: You will need to use GROUP BY GENDER grouping to
get the result
- Any Error throw Custom Exceptions
- E.g. SELECT SUM(salary) FROM employee_payroll
WHERE gender = 'F' GROUP BY gender;

