package ExceptionHandling;

public class Exceptionee {

    public static void main(String[] args) {
        try {
            int[] a = new int[5];
            a[5] = 30 / 0;
        } catch (ArithmeticException a) {
            System.out.println(a + " exception occurred");
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println(a);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("parent exception");
        }
    }

}
