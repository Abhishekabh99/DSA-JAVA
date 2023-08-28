public class Pattern {
    public static void main(String[] args) {
        square();
    }

    public static void square() {
        int i = 0;
        while (i < 5) {
            int j = 0;
            while (j < 5) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
