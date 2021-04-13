package ExceptionHandling;

public class throwException {
     static void ValidatePerson(int age) {
        if (age < 18)
            throw new ArithmeticException("not valid");
        else {
            System.out.println("Welcome to UPES");
        }
    }

    public static void main(String[] args) {

        int age = 15;
        ValidatePerson(age);

    }


}
