package RunTimePolyMorphism;

class RBI{
    float getROI(){return 0.0f;}
}

class pnb extends RBI{
    float getROI(){return 8.3f;}
}
class sbi extends RBI{
    float getROI(){return 10.2f;}
}

class Bank {
    public static void main(String[] args) {
        RBI bank;
        bank= new pnb();
        System.out.println(bank.getROI());
        bank = new sbi();
        System.out.println(bank.getROI());

    }
}

