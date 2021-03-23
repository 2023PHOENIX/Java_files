package com.company;

class outer{
    int x= 10;

    protected class inner{
        int y = 200;

    }
}

public class Main {

    public static void main(String[] args) {
        // write your code here
       outer ou = new outer();
       outer.inner in = ou.new inner();
       System.out.println(in.y + ou.x);
    }
}
