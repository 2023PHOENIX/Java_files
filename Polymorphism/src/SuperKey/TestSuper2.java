package SuperKey;

class Person{
    int id;
    String name;
    Person(int id,String name){
        this.name = name;
        this.id = id;
    }
}

class Employee extends Person{
    float salary;
    Employee(int id,String name,float salary)
    {
        super(id,name);
        this.salary = salary;
    }

    void display(){
        System.out.println(id+" "+name + " "+salary);
    }
}
public class TestSuper2 {
    public static void main(String[] args) {
        Employee ep = new Employee(289,"abhishek",100000);
        ep.display();
    }
}
