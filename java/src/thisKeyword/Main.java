package thisKeyword;
class StudentData {

    String name, course;
    float fee;
    int rollno;

    StudentData(int rollno, String name, String course) {
        this.rollno = rollno;
        this.name = name;
        this.course = course;
    }

    StudentData(int rollno, String name, String course, float fee)
    {
        this(rollno,name,course);   // reusing the constructor
        this.fee = fee;
    }

    void display(){
        System.out.println(rollno+" "+name+" "+course+" "+fee);}
    }


public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello");
        StudentData s1 = new StudentData(45,"achal","biotech");
        StudentData s2 = new StudentData(119,"abhishek","AI",600000f);
        s1.display();
        s2.display();
    }
}
