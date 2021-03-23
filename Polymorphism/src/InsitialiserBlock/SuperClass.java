package InsitialiserBlock;
class ab{
    ab() {
        System.out.println("Parent is invoked");
    }
}

class B extends  ab{

    B() {
        super();
        System.out.println("Child has been invoked");
    }

    B(int a){
        super();
        System.out.println("child invoke with : " + a);
    }
    {System.out.println("insitaliser block has been called");}
}


public class SuperClass {


    public static void main(String[] args) {
        B b1=new B();
        B b2=new B(10);
    }

}
