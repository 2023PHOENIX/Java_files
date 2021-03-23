package que3;

class Worker {
    private String full_name;

    Worker(String full_name) {
        this.full_name = full_name;
//        this.salary  = salary;
    }

    String get_name() {
        return full_name;
    }
}

class DailyWorker extends Worker {

    private double salary_per_day;
//    private int no_of_day;


    DailyWorker(String full_name, double salary) {
        super(full_name);
        salary_per_day = salary;
//        this.no_of_day = no_of_day;
    }


    void Compay(int hr) {
        System.out.println(get_name() + " get paid :" + salary_per_day * hr);
    }


}

class SalariedWorker extends Worker {
    private double salary_fixed;


    SalariedWorker(String full_name, double salary) {
//        here we use constructor of super class which is polymorphism
        super(full_name);
        salary_fixed = salary;
    }

    void Compay(int hr) {
        System.out.println(get_name() + " get paid : " + 40 * salary_fixed);
    }
}

public class TestClass {
    public static void main(String[] args) {
        DailyWorker dw = new DailyWorker("carl", 100.11);
        dw.Compay(19);
        SalariedWorker sw = new SalariedWorker("stefan", 150.2);
        sw.Compay(4);
    }


}
