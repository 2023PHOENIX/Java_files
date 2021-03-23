package RunTimePolyMorphism;

class Shape{
    void draw(){
        System.out.println("Drawing...");
    }
}
class Rectangle extends Shape{
    void draw(){
        System.out.println("Drawing rectangle");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("Drawing circle...");
    }
}

class Square extends Shape{
    void draw(){
        System.out.println("Drawing square..");
    }
}
public class drawing {

    public static void main(String[] args) {
        Shape sp;
        sp = new Shape();
        sp.draw();
        sp = new Circle();
        sp.draw();


        sp = new Rectangle();
        sp.draw();

        sp = new Square();
        sp.draw();


    }
}
