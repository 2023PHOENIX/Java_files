package Question4;

import java.util.Scanner;

public class question4 {


    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        String name = new String(sc.nextLine());

        System.out.println("Length of my name is : " + name.length());
        int i = 1;
        for(char x : name.toCharArray()){
            if(x=='a') {
                System.out.println("a appears in name at : " + i);
            }
            i++;
        }
    }

}
