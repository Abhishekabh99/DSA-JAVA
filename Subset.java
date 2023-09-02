import java.util.*;

public class Subset {
    public static void main(String[] args) {
        int[] arr;
        arr = in();
        display(arr);
        generateSubsets(arr);

    }

    // input array
    public static int[] in() {
        System.out.println("Enter size of array :");
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int i = 0;
        int[] arr = new int[s];
        while (i < s) {
            System.out.println("Enter " + i + " element of the array :");
            arr[i] = sc.nextInt();
            i++;
        }
        return arr;
    }

    // display
    public static void display(int[] arr) {
        int i = 0;
        System.out.print("your array :");
        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i++;
        }
        System.out.println();
    }

    // subsets
    public static void generateSubsets(int[] arr) {
        List<List<Integer>> subsets = new ArrayList<>();
        helper(arr, 0, new ArrayList<>(), subsets);
        for (List<Integer> subset : subsets) {
            System.out.println(subset);
        }

    }

    public static void helper(int[] arr, int index, List<Integer> curr, List<List<Integer>> subsets) {
        // basecase
        if (index == arr.length) {
            subsets.add(new ArrayList<>(curr));
            return;
        }
        // include the current element
        curr.add(arr[index]);
        helper(arr, index + 1, curr, subsets);

        // exclude current element
        curr.remove(curr.size() - 1);
        helper(arr, index + 1, curr, subsets);
    }

}
