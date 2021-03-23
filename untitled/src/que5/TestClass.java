package que5;

class Employee {
    private String name;
    private int ID;
    private double salary;

    Employee() {
        this.name = "null";
        this.salary = 0.00;
        this.ID = 11111;
        System.out.println("hey defualt constructor has been called");
    }

    public Employee(String name, int ID, double salary) {
        this.name = name;
        this.ID = ID;
        this.salary = salary;
        System.out.println("constructor is been called for Employee");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    double increaseSalary(double increament) {
        return salary * (increament / 100) + salary;
    }

    void PrintDetails() {
        System.out.println("employee name : " + name + " salary " + salary);
    }
}

class Manager extends Employee {
    private String department;

    public Manager(String name, int ID, double salary, String department) {
        super(name, ID, salary);
        this.department = department;
        System.out.println("department manager constructor has been called");
    }

    @Override
    void PrintDetails() {
        System.out.println("Manager name is: " + getName() + "\ndepartment : " + department + "\nsalary :" + getSalary());

    }
}

public class TestClass {

    public static void main(String[] args) {
        Manager M = new Manager("thor", 181, 184154.23, "Universe");
        M.PrintDetails();

        Employee ep = new Employee("ranga", 1818, 9191.11);
        M.PrintDetails();
    }

}
