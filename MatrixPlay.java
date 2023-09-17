import java.util.Scanner;

public class MatrixPlay {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows :");
        int nr = sc.nextInt();
        System.out.println("Enter number of columns :");
        int nc = sc.nextInt();
        int[][] mat = new int[nr][nc];
        mat = cm(nr, nc);
        display(mat);
        countOnes(mat);
        int c = ni(mat);
        System.out.println("Number of islands equals to :" + c);
    }

    // creating matrix
    public static int[][] cm(int nr, int nc) {
        Scanner sc = new Scanner(System.in);
        int[][] mat = new int[nr][nc];
        for (int i = 0; i < nr; i++) {
            for (int j = 0; j < nc; j++) {
                System.out.println("Enter for " + i + "" + j + " element :");
                mat[i][j] = sc.nextInt();
            }
        }
        return mat;
    }

    // print matrix
    public static void display(int[][] mat) {
        System.out.println("Your matrix below :");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    // counting number of 1's in matrix
    public static void countOnes(int[][] mat) {
        int count = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1) {
                    count++;
                }
            }
        }
        System.out.println("number of 1's in your matrix are :" + count);
    }

    // number of island
    public static int ni(int[][] mat) {
        int isIslandCount = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == '1') {
                    isIslandCount++;

                    searchIslandDFS(mat, i, j);
                }
            }
        }
        return isIslandCount;
    }

    public static void searchIslandDFS(int[][] mat, int i, int j) {
        // check the boundaries and the current cell's value.
        if (i < 0 || i >= mat.length || j < 0 || j >= mat[i].length || mat[i][j] == '0') {
            return;
        }
        // set the value of the grid cell to '0'
        mat[i][j] = 0;
        // explore all four directions
        searchIslandDFS(mat, i + 1, j);
        searchIslandDFS(mat, i - 1, j);
        searchIslandDFS(mat, i, j + 1);
        searchIslandDFS(mat, i, j - 1);
    }
}
