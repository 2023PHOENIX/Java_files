package Inheritance;

public class Employee {
    float Salary = 300000;
}

class Programmer extends Employee
{
    int bonus = 1999;

    public static void main(String[] args) {
        Programmer p = new Programmer();
        System.out.println(p.Salary + " "+ p.bonus);

    }
}
