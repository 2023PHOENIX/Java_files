package GFG;
import java.util.*;
public class AndRange {
    public static void main(String[] args) {
        int a = 25;
        int b = 28;
    int off_bits = 0;
        while(a!=b){
            a = a>>1;
            b = b >> 1;
            off_bits += 1;
        }

        System.out.println(a<<off_bits);
    }
}
