package que1;


class Device{
//    here we have private access to every intance except for price
    private boolean display;
    private int camera;
    private boolean charger;
    protected int price;
}


public class Phones extends Device {


    public static void main(String[] args) {
//    here if we try to access display directly we will get error
//        if we try to access price we don't get any error because we use protected access modifier
        Device d = new Device();
        d.price = 10;

//        d.display = true;

        System.out.println(d.price+" ");
    }
}
