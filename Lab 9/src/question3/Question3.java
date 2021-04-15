
import java.util.*;
public class Question3 {

    public static void main(String[] args) {


        for(String s : args){
            String S = "";
            char c='a';
            for(char x : s.toCharArray()){
                c = x;
                if(x >= 'a' && x <= 'z') {
                    c = (char) (x - 32);
                }
                S+= c;
            }
            System.out.println(S);

        }

//        System.out.println(S);
    }
}
