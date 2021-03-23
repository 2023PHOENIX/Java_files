package InsitialiserBlock;

public class Bike {
    int speed;

    Bike(){
        System.out.println("speed is "+ speed);
    }
    {speed = 100;}


    public static void main(String[] args) {
        Bike bk = new Bike();

        System.out.print(bk.speed);
    }
}
