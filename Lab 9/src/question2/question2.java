package question2;

import java.util.*;
public class question2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        StringBuffer S = new StringBuffer(in.nextLine());

        String X = "";

        for(int i=0;i<S.length();i++){
            char c = S.charAt(i);
            if(c>='a' && c <='z'){
                X+= (char)(c-32);
            }
            else{
                X+=c;
            }
        }
        System.out.println(X);
    }

}
