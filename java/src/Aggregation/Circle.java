package Aggregation;

class Square{
    int square(int n){
        int x = n*n;
        return x;
    }
}

public class Circle {
    Square sq;

    double pi = 3.14;

    double area(int radius)
    {
        sq = new Square();
        double circle_radius = sq.square(radius) * 3.14;

        return circle_radius;
    }


    public static void main(String[] args) {
        Circle c = new Circle();
        double result = c.area(10);

        System.out.print(result);
    }
}
