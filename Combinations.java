import java.util.*;

public class Combinations {
    public static void main(String[] args) {
        comb(4, 2);
    }

    // combinations
    public static void comb(int n, int k) {
        // generating array out of n
        int[] arr = new int[n];
        for (int i = 1; i <= n; i++) {
            arr[i - 1] = i;
        }
        // generating list of list of integer including all the permutaions of size k
        List<List<Integer>> combins = new ArrayList<>();
        // calling helper function for backtracking logic
        helper(arr, new ArrayList<>(), combins, k);
        // printing
        for (List<Integer> i : combins) {
            System.out.println(i);
        }
    }

    // helper fuction
    public static void helper(int[] arr, List<Integer> curr, List<List<Integer>> combins, int k) {
        // basecase
        if (curr.size() == k) {
            combins.add(new ArrayList<>(curr));
            return;
        }
        // looping through array
        for (int i : arr) {
            if (curr.isEmpty() || i > curr.get(curr.size() - 1)) {
                // including element
                curr.add(i);
                // backtracking
                helper(arr, curr, combins, k);
                // removing element
                curr.remove(curr.size() - 1);
            }
        }
    }
}
