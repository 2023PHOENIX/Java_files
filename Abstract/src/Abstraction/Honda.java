package Abstraction;
abstract class Bike{
//    it help in hiding the data
    Bike(){System.out.println("Bike is created");}
    abstract void run();
    void changeGear(){
        System.out.println("gear changed");
    }

}

class Honda extends Bike{
    void run(){
        System.out.println("runnign safety");
    }

}
