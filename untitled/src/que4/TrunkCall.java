package que4;

class Call {
    private String type_of_call;
    private double call_duration;

    Call(String type_of_call, double call_duration) {
        this.call_duration = call_duration;
        this.type_of_call = type_of_call;
    }

    double charges_for_call() {
        double tcall = 0;
        if (type_of_call == "ordinary"){ tcall = 10.00;}
        else if (type_of_call == "urgent"){ tcall = 100.00;}
        else{
            tcall = -1;
        }
        return tcall * call_duration;
    }

}

public class TrunkCall {
    public static void main(String[] args) {
        Call C = new Call("ordinary",14);
        System.out.println(C.charges_for_call());
        Call cm = new Call("urgent",14);
        System.out.println(cm.charges_for_call());
    }
}
