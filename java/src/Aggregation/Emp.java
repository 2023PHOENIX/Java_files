package Aggregation;

public class Emp {

    int id;
    String name;
    Address address;

    public Emp(int id,String name,Address address)
    {
        this.address = address;
        this.name = name;
        this.id = id;
    }

    void display(){
        System.out.println(this.id + " " + this.name);
        System.out.println(this.address.city + " " + this.address.state + "  " + this.address.country);
    }



    public static void main(String[] args) {
        Address ad1 = new Address("Dholakput","Rajasthan","Hidustan");
        Address address2=new Address("gno","UP","india");


        Emp em = new Emp(454,"bheem",ad1);

        Emp arnav = new Emp(555,
                "arnav",
                address2);

        em.display();
        arnav.display();





    }
}
