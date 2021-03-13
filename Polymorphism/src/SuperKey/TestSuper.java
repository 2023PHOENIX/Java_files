package SuperKey;

class Animal{
    String colour = "white";
}
class Dog extends Animal{
    String colour = "black";

    void printColour(){
        System.out.println(this.colour);
        System.out.println(super.colour);
    }
}

public class TestSuper
{

    public static void main(String[] args) {
        Dog dg = new Dog();
        dg.printColour();
    }
}
