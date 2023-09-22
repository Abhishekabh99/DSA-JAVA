import java.util.HashMap;

class Strings {

    public static void main(String[] args) {
        String s1 = "loonbalxballpoon";
        // covert string to character array
        char[] s1c = s1.toCharArray();
        // store array elements in hashmap
        HashMap<Character, Integer> map = new HashMap<>();
        for (char a : s1c) {
            if (a == 'b' || a == 'a' || a == 'l' || a == 'o' || a == 'n') {
                if (map.containsKey(a)) {
                    map.put(a, map.get(a) + 1);
                } else {

                    map.put(a, 1);
                }
            }
        }
        int minCount = Integer.MAX_VALUE;
        minCount = Math.min(minCount, map.getOrDefault('b', 0));
        minCount = Math.min(minCount, map.getOrDefault('a', 0));
        minCount = Math.min(minCount, map.getOrDefault('l', 0) / 2);
        minCount = Math.min(minCount, map.getOrDefault('o', 0) / 2);
        minCount = Math.min(minCount, map.getOrDefault('n', 0));

        System.out.println(minCount);

    }

}