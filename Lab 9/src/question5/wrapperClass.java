package question5;

import java.util.Scanner;

public class wrapperClass {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();

        Integer I = Integer.valueOf(a);

        System.out.println("int to Integer : " + I);

        String S = String.valueOf(a);

        System.out.println("int to string :" + S);


        String txt = in.nextLine();

        Integer x = Integer.parseInt(txt);
        System.out.println("String to integer :" + x);



    }
}
