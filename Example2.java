import java.util.Scanner;

class Example2 {
    public static void main(String[] args) {
        int[] arr = inarr();
        display(arr);
        int ng = nge(arr, 3);
        System.out.println(ng);
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

    // next greater element in array
    public static int nge(int[] arr, int index) {
        int c = arr[index];
        for (int i = index; i < arr.length; i++) {
            if (arr[i] > c) {
                return arr[i];
            }
        }
        return -1;
    }
}