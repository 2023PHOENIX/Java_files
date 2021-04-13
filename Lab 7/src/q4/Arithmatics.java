package q4;
interface ArithmaticsMethods{
    double division(int a,int b);
    double multiplication(int a,int b);
}
public class Arithmatics implements ArithmaticsMethods{

    @Override
    public double multiplication(int a, int b) {
        return (double)a*b;
    }

    @Override
    public double division(int a, int b) {
        if(b==0)
            return -1;
        return (double) a/b;
    }

    public static void main(String[] args) {
        Arithmatics Am = new Arithmatics();

        double x = Am.division(5,2);
        System.out.println(x);

        double y = Am.multiplication(6,7);
        System.out.println(y);
    }
}
