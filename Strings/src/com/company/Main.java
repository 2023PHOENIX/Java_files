package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String s = "Sachin";
        String ss = "Tendulkar";

        String d  = s.concat("Tendulkar");
        System.out.println(d);

        String name = "Abhishek";
        String name2 = "abhishek";

        String name3 = "Abhishek";
        String name4 = new String("Abhishek");
        if(name==name4)     // here it check the reference which is not same
        {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

        if(name==name3){
            System.out.println("positive");
        }
        else{
            System.out.println("negative");
        }
        System.out.println(name.equalsIgnoreCase(name2));
        System.out.println(name.equals(name2));
    }
}
