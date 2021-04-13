package q3;

import java.awt.geom.Area;

interface AreasConst{
//    we can use these const whenever we want to use
//    since they are not going to change they are set and final
    final float pi = 3.14f;
    double Area(int r);
}
public class Demonstrait implements AreasConst {
    @Override
    public double Area(int r){
        return (double)pi*(r*r);
    }
    public static void main(String[] args) {
        Demonstrait demo = new Demonstrait();
        double x = demo.Area(7);
        System.out.println(x);
    }
}
