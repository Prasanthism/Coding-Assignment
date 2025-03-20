import java.util.*;

public class Employee {
    private int id;
    private String name;
    private double salary;
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}

class Employee1 {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Prasanth", 40000);
        Employee emp2 = new Employee(2, "Raju", 30000);
        Employee emp3 = new Employee(3, "Clara", 100000);
        List<Employee> List = new ArrayList<>();
        List.add(emp1);
        List.add(emp2);
        List.add(emp3);
        System.out.println("Employee Details:");
        for (Employee emp : List) {
            emp.displayDetails();
        }
    }
}
