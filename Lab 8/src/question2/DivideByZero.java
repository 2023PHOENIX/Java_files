package question2;

public class DivideByZero {
    public static void main(String[] args) {
        try{
            int a= 10;
            int b = 0;

            System.out.println(a/b);
        }catch(ArithmeticException a){
            System.out.println(a + " successfully handled");
        }
    }
}
