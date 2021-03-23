package InsitialiserBlock;
class A{
    A(){
        System.out.println("super class constructor has been called");
    }
}


public class superclass extends A {

    superclass() {
        super();

        System.out.println("child class called");
    }

    {System.out.println("instance instialiser block is called");}


    public static void main(String[] args) {
        superclass sc = new superclass();


    }

}
