package MethodOverRiding;

class RBI{
    double getRateofInterest(){
        return 5.5;
    }
}

class sbi extends RBI{

    double getRateOfInterest(){return 7.28;}
}
class pnb extends RBI{
    double getRateOfInterest(){return 10.57;}
}

public class ROI{
    public static void main(String[] args) {


        sbi sb = new sbi();
        double in = sb.getRateOfInterest();
        System.out.println(in);


        pnb pb = new pnb();
        in = pb.getRateOfInterest();
        System.out.println(in);



    }
}
