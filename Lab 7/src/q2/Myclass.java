package q2;
interface A{
    void method_1();
    void method_2();
}
class Myclass implements A{
    @Override
    public void method_1() {
        System.out.println("this is method 1 inside Myclass");
    }

    @Override
    public void method_2() {
        System.out.println("this is method 2 inside Myclass");
    }

    public static void main(String[] args) {
        Myclass cl = new Myclass();
        cl.method_1();
        cl.method_2();
    }

}
