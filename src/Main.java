// Encapsulation
class Employee {
    private String emp_name;
    private int emp_id;
    private double salary;

    //Constructor
    public Employee(String emp_name, int emp_id, double salary) {
        this.emp_name = emp_name;
        this.emp_id = emp_id;
        this.salary = salary;
    }

    // Getter methods
    public String getEmployeeName() {
        return this.emp_name;
    }

    public int getEmployeeId() {
        return this.emp_id;
    }

    public double getEmployeeSalary() {
        return this.salary;
    }

    // Setter methods
    public void setEmployeeName(String employeeName) {
        this.emp_name = employeeName;
    }

    public void setEmployeeId(int employeeId) {
        this.emp_id = employeeId;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.salary = employeeSalary;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("David", 43, 39205.25);
        System.out.println(emp.getEmployeeName());
        System.out.println(emp.getEmployeeId());
        System.out.println(emp.getEmployeeSalary());
        
        emp.setEmployeeName("Elon Musk");
        emp.setEmployeeId(13);
        emp.setEmployeeSalary(294859.492);
    }
}
