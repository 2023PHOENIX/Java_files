package q1;

interface Test{
    int square(int a);
}

class Arithmetic implements Test{
    public int square(int a){
        return a*a;
    }
}

class TotestInt extends Arithmetic{
    public static void main(String[] args) {
        TotestInt tint = new TotestInt();
        System.out.println(tint.square(4));
    }
}
