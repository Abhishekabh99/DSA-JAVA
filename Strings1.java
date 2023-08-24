import java.util.*;

class Strings1 {
  public static void main(String[] args) {
    String[] arrs = in();
    display(arrs);

  }

  // array of strings user input
  public static String[] in() {
    System.out.println("Enter size of array :");
    Scanner sc = new Scanner(System.in);
    int s = sc.nextInt();
    sc.nextLine(); // Consume the newline character
    String[] arrs = new String[s];
    for (int i = 0; i < s; i++) {
      System.out.println("Enter element for index :" + i);
      arrs[i] = sc.nextLine();
    }
    return arrs;

  }

  // display
  public static void display(String[] arrs) {
    for (int i = 0; i < arrs.length; i++) {
      System.out.println("Element at index " + i + ": " + arrs[i]);
    }
  }

  // grouping anagrams

}