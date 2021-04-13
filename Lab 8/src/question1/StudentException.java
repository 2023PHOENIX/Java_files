package question1;
import java.util.*;

class Student{
    String name;
    int RollNo;
    Student(){
        System.out.println("Default constructor");
    }
    Student(String name,int rollNo){
        this.name = name;
        this.RollNo = rollNo;
    }
}
public class StudentException {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try{
            Student[] studentArray = new Student[10];
        String s = "a";
        int rollno = 1;
            for(int i=0;i<11;i++){

                studentArray[i] = new Student(s,rollno);
                s = s + 'a';
                rollno += 1;
            }
            for(Student x : studentArray)
                System.out.println(x.name +" " +  x.RollNo);
            }catch(ArrayIndexOutOfBoundsException a){
            System.out.println("Exception Caught successfully\n" + a);
        }
    }
}
