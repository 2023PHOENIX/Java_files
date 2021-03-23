package Abstraction;

abstract class Shape{
    abstract void draw();
}

class Rectangle extends Shape{
    void draw(){
        System.out.println("Printing rectangle");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("printing circle");
    }
}
public class TestAbstaction {

    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();
    }

}
