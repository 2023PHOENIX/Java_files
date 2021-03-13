package thisKeyword;

public class Student {
    int rollno;
    String name;
    float fee;

    Student(int r,String n,float f)
    {
        rollno = r;
        name = n;
        fee = f;
    }

    void display(){
        System.out.println(rollno + " " + name + " "+fee);
    }

    public static void main(String[] args) {
        Student s1 = new Student(111,"abhi",69000f);
        Student s2=new Student(112,"sumit",6000f);

        s1.display();
        s2.display();
    }
}
