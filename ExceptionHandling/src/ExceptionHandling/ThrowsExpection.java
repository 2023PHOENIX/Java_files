package ExceptionHandling;
import java.io.*;


class M{
    void method() throws IOException{
        throw new IOException("device Error");

    }
}
public class ThrowsExpection {
    public static void main(String[] args) {

        try{
            M m = new M();
            m.method();
        }catch(Exception e){
            System.out.println(e + " exception handled");
        }
        System.out.println("normal flow");
    }
}
