import java.util.ArrayList;
import java.util.Stack;

class TreeNode2 {
    int val;
    TreeNode2 left;
    TreeNode2 right;

    public TreeNode2(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}

class Example2 {

    public static void main(String[] args) {
        // making tree 1
        TreeNode2 root = new TreeNode2(1);
        root.left = new TreeNode2(2);
        root.right = new TreeNode2(3);
        // making tree 2
        TreeNode2 root1 = new TreeNode2(1);
        root1.left = new TreeNode2(2);
        root1.right = new TreeNode2(4);
        // preorder traversal
        System.out.println("Printing preorder traversal below :");
        preorder(root);
        System.out.println();
        // postorder traversal
        System.out.println("Printing postorder traversal below :");
        postorder(root);
        System.out.println();
        // printing inorder traversal below
        System.out.println("Printing inorder traversal below :");
        inorder(root);
        System.out.println();
        // printing count of nodes
        System.out.println("below is the number of nodes in the tree :");
        System.out.println(countNodes(root1));
        // checking my pl fuction
        ArrayList<Integer> al = pl(root);
        System.out.println("preorder :");
        for (int i : al) {
            System.out.print(i + " ");
        }
        System.out.println();
        // checking tree is same or not
        System.out.println("checking tree is same or not :");
        System.out.println(checks(root, root1));
    }

    // preorder traversal
    public static void preorder(TreeNode2 node) {

        if (node != null) {
            System.out.print(node.val + " ");
            preorder(node.left);
            preorder(node.right);
        }

    }

    // postorder traversal
    public static void postorder(TreeNode2 node) {
        if (node != null) {
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.val + " ");

        }

    }

    // inorder traversal
    public static void inorder(TreeNode2 node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.val + " ");
            inorder(node.right);
        }
    }

    // count number of nodes in the tree
    public static int countNodes(TreeNode2 root) {
        if (root == null) {
            return 0;
        }
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    // storing preorder traversal of tree in a list
    public static ArrayList<Integer> pl(TreeNode2 root) {
        ArrayList<Integer> al = new ArrayList<>();
        if (root == null) {
            return al;
        }
        // Create a stack to simulate the recursive call stack
        Stack<TreeNode2> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode2 n = stack.pop();
            if (n != null) {
                al.add(n.val);
                // Push the right child onto the stack (will be processed after left)
                stack.push(n.right);
                // Push the left child onto the stack
                stack.push(n.left);
            }
        }
        return al;
    }

    // check if tree is same or not
    public static boolean checks(TreeNode2 root1, TreeNode2 root2) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr1 = pl(root1);
        arr2 = pl(root2);
        for (int i : arr2) {
            System.out.print(i + " ");
        }
        if (arr1.equals(arr2)) {
            return true;

        } else
            return false;

    }
}
