package Inheritance;


class Animal{
    void eat(){
        System.out.println("eating...!!");
    }
}
class Dog extends Animal {
    void bark(){
        System.out.println("barking");
    }
}
class BabyDog extends  Dog{
    void weep(){
        System.out.print("weeping..!!\n");
    }
}
public class multipleInherit {


    public static void main(String[] args) {
        BabyDog bd = new BabyDog();
        bd.weep();
        bd.bark();
        bd.eat();
    }
}
