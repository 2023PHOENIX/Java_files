package com.company;


class Student {
    int rollNo;     // instance variable
    String name;
    static String college = "UPES"; // Whenever student is called his school is UPES


    // constructor
    Student(int r,String n)
    {
        this.rollNo = r;
        this.name = n;
    }
    static int cube(int x)
    {
        return x*x*x;
    }
    void display(){
        System.out.println(this.rollNo + " " + this.name +" "+ college);
    }
}


public class Main {

    public static void main(String[] args) {
	// write your code here
//        Student s1 = new Student(111,"karan");
//        Student s2 = new Student(222,"Aryan");
//
//        s1.display();
//        s2.display();
        int x = Student.cube(19);
        System.out.println(x);

    }
}
