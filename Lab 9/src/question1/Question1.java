package question1;
import java.util.*;

public class Question1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String s = in.nextLine();


        String findString = in.nextLine();
        int firstIndex = s.indexOf(findString);
        System.out.println(firstIndex);

        int lastIndex = s.lastIndexOf(findString);
        System.out.println(lastIndex);
    }
}
