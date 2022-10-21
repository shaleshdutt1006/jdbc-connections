import java.time.LocalDate;
import java.util.Objects;

/*
Making a class of EmployeePayrollData So we can add id,name,salary items in a arrayList using constructor of
EmployeePayrollData
 */
public class EmployeePayrollData {
    public int id;
    public String name;
    public double salary;
    public LocalDate startDate;

    public EmployeePayrollData(int id, String name, double salary, LocalDate startDate) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return "EmployeePayrollData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", date=" + startDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmployeePayrollData that = (EmployeePayrollData) o;

        if (id != that.id) return false;
        if (Double.compare(that.salary, salary) != 0) return false;
        if (!Objects.equals(name, that.name)) return false;
        return Objects.equals(startDate, that.startDate);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        temp = Double.doubleToLongBits(salary);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        return result;
    }
}

