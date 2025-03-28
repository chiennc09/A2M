package Inheritance;

class Employee {
    protected String name;
    protected String employeeId;

    public Employee(String name, String employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }
    public void displayInfo() {
        System.out.println("Tên: " + name);
        System.out.println("Mã nhân viên: " + employeeId);
    }
    public double calculateSalary() {
        return 0;
    }
}
class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String name, String employeeId, double monthlySalary) {
        super(name, employeeId);
        this.monthlySalary = monthlySalary;
    }
    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}
public class Inheritance {
    public static void main(String[] args) {
        FullTimeEmployee emp = new FullTimeEmployee("Nguyễn Văn A", "FT123", 2000);
        emp.displayInfo();
        System.out.println("Lương: " + emp.calculateSalary() + " $\n");
    }
}
