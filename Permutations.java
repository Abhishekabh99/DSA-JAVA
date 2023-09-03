import java.util.*;

public class Permutations {
    public static void main(String[] args) {
        int[] arr = in();
        display(arr);
        permute(arr);
    }

    // input
    public static int[] in() {
        System.out.println("Enter size of the array :");
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int[] arr = new int[s];
        int i = 0;
        while (i < s) {
            System.out.println("Enter " + i + " element of the array");
            arr[i] = sc.nextInt();
            i++;
        }
        return arr;
    }

    // display
    public static void display(int[] arr) {
        System.out.print("Your array :");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // permutations
    public static void permute(int[] arr) {
        List<List<Integer>> permuts = new ArrayList<>();
        helper(arr, 0, new ArrayList<>(), permuts);
        // printing permutations
        System.out.println("All possible permutations below :");
        for (List<Integer> list : permuts) {
            System.out.println(list);
        }
    }

    public static void helper(int[] arr, int index, List<Integer> curr, List<List<Integer>> permutes) {
        // basecase
        if (curr.size() == arr.length) {
            permutes.add(new ArrayList<>(curr));
            return;
        }
        for (int i : arr) {
            if (!curr.contains(i)) {
                // including element
                curr.add(i);
                // backtracking
                helper(arr, index, curr, permutes);
                // excluding element
                curr.remove(curr.size() - 1);
            }
        }
    }
}
