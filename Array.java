import java.util.*;

class MinDif {
    public static void main(String[] args) {
        // int[] arr = inarr();
        // display(arr);
        // int max = highest(arr);
        // System.out.println("Highest number is : " + max);
        // int min = lowest(arr);
        // System.out.println("Lowest number is " + min);
        // System.out.println("executing next greater element :");
        int[] sarr = { 4, 1, 2 };
        int[] marr = { 1, 3, 4, 2 };
        int[] ngarr = ng(sarr, marr);
        for (int i : ngarr) {
            System.out.print(i + " ");

        }
        System.out.println();
    }

    // find highest in array
    public static int highest(int[] arr) {
        int curr = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > curr) {
                curr = arr[i];
            }
        }
        return curr;
    }

    // find lowest in array
    public static int lowest(int[] arr) {
        int curr = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < curr) {
                curr = arr[i];
            }
        }
        return curr;
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

    // next greater element
    public static int[] ng(int[] sarr, int[] marr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < marr.length; i++) {
            map.put(marr[i], nge(marr, i));
        }
        int[] ans = new int[sarr.length];
        for (int i = 0; i < sarr.length; i++) {
            ans[i] = map.get(sarr[i]);
        }
        return ans;
    }

    // next greater element in an array
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