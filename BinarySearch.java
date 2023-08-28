import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = inarr();
        display(arr);

    }

    // user input array
    public static int[] inarr() {
        System.out.println("Enter Size of array :");
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int[] arr = new int[s];
        for (int i = 0; i < s; i++) {
            System.out.println("Enter element of array for index :" + i);
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    // display array
    public static void display(int[] arr) {
        System.out.println("Array elements are below :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // binary search
    public static int bs(int[] arr, int v) {
        System.out.println("Enter the index of the array");
        int s = arr[0];
        int e = arr[arr.length - 1];

        int m;
        while (m == v) {
            m = (s + e) / 2;
            if (m == v)
                return arr[m];

        }

    }
}
