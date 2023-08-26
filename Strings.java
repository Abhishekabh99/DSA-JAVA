import java.util.*;

public class Strings {

    public static void main(String[] args) {
        Strings obj = new Strings(); // created instance of class in main method
        String s1 = obj.in();
        String s2 = obj.in();
        System.out.println("Your meged strings below");
        System.out.println(obj.merge(s1, s2));
    

    // userInputString
    String in() {
        System.out.println("Enter your String");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        return s1;
    }

    // merge strings
    String merge(String s1, String s2) {
        String s3 = s1 + s2;
        return s3;
    }

}
