package MethodOverloading;

class Argu{
    static int add(int a,int b){return a+b;}
    static int add(int a,int b,int c){return a+b+c;};

    static int add(int a,int b,int c,int d){return a+b+c;}
}

public class Arguments {

    public static void main(String[] args) {
        System.out.println(Argu.add(1,3,4));
        System.out.println(Argu.add(89,90));
        System.out.println(Argu.add(1,4,4,5));
    }



}
