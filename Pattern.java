public class Pattern {
    public static void main(String[] args) {
        System.out.println("square pattern below :");
        square();
        System.out.println("right angle traingle below :");
        rat();
    }

    // square pattern
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

    // right angle traingle
    public static void rat() {
        int i = 0;

        while (i < 5) {
            int j = 0;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
    //
}
