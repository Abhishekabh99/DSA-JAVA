import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class Example2 {
    public static void main(String[] args) {
        int[] arr = { 1, 1 };
        List<Integer> ans = new ArrayList<>();
        ans = dn(arr);
        System.out.println(ans.toString());
    }

    // dn
    public static List<Integer> dn(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : arr) {
            set.add(i);
        }
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 1; i <= arr.length; i++) {
            if (!set.contains(i)) {
                al.add(i);
            }
        }
        return al;
    }
}