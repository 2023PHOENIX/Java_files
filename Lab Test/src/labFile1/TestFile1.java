package labFile1;

interface ArithmaticOp{
    public double division();
    public double modulo();
}

abstract class Operation implements ArithmaticOp{
//    @override
    public static double division(int a, int b) {
        return a/b;
    }
//    @override
    public static double modulo(int a,int b){
        return a%b;
    }

    public static void main(String[] args) {
//        Operation op = new Operation();
                System.out.println(modulo(10,20));
                System.out.println(division(454,53));
    }

}

