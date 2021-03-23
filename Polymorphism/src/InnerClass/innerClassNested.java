package InnerClass;
interface Player{
    final int a=10;
    void display();
}
class TestClass implements Player{
    public void display(){
        System.out.println("Geeks");
    }
}
public class innerClassNested  {

    public static void main(String[] args) {
        TestClass tc = new TestClass();
        tc.display();
        System.out.println(tc.a);
    }



}
