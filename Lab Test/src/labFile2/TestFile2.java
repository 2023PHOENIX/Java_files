package labFile2;


import java.util.Arrays;

class EmployeeCopy{
    int x,y;
}
class Employee implements Cloneable{
    int id;
    String name;
    Department department;
//  clone deep copy
    EmployeeCopy EC = new EmployeeCopy();
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }



//    default constructor
    public Employee(){
        this.id = 0;
        this.name = "null";
        this.department = new Department(0,"null");
    }

    public Employee(int id, String name,int dep_id) {
        this.id = id;
        this.name = name;
        this.department = new Department(dep_id,name);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void show(){
        System.out.println("employee name is :"+getName() + "\nId : " + getId());
        department.depshow();
    }
}


public class TestFile2 {

    public static void main(String[] args)
            throws CloneNotSupportedException {
//        Employee E = new Employee();
//        E.show();
//        Department dp = new Department(1818,"Luke");
//        dp.depshow();
        Employee E2 = new Employee(111,"carl",1919);
        E2.show();

        Employee E2copy = (Employee)E2.clone();
        E2copy.setName("Venom");
        E2copy.setId(181);

        E2copy.show();

        Employee[] epArray = new Employee[2];
        epArray[0] = E2;

        epArray[1] = E2copy;






    }
}
