package MethodOverRiding;

class Vehicle{

    int wheels = 4;
    void run(){
        System.out.print("Vehine is running");
    }
    int getwheels(int x)
    {
        wheels = x;

        return wheels;
    }
}
// inheritance
public class Bike extends Vehicle{

    void run(){
        System.out.print("bike is running with safety");
    }

    public static void main(String[] args) {
        Bike dominar = new Bike();
        dominar.run();
        int x = dominar.getwheels(2);
        System.out.println(x);


    }
}
