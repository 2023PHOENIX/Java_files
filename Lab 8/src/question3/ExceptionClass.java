package question3;
class NotNumber extends Exception{
    NotNumber(){
        super("This is not integer value exception");
    }
}
public class ExceptionClass extends Exception {

    public static void main(String[] s) {
        int a,b;
        try{
            a = Integer.parseInt(s[0]);
            b = Integer.parseInt(s[1]);
            int c = a %b;
            System.out.println(c);
            throw new NotNumber();

        }
        catch(NumberFormatException N){
            System.out.println(N);
        }
        catch(NotNumber n){
            System.out.println(n);

        }
        catch(Exception e)
        {
            System.out.println(e + "find");
        }

    }
}
