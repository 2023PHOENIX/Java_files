package thisKeyword;

class A{
    Argument obj;

    A(Argument obj)
    {
        this.obj = obj;
    }

    void display(){
        System.out.println(obj.data);
    }

}

public class Argument {
    int data = 10;
    Argument(){
         A objA = new A(this);
         objA.display();
    }
    public static void main(String[] args) {
       Argument a = new Argument();

    }
}
