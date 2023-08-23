class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.val = data;
        left = null;
        right = null;
    }
}

public class Tree {
    public static void main(String[] args) {
        // making simple tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        System.out.println("Preorder Traversal Below");
        pre(root);
        System.out.println("Postorder Traversal Below");
        post(root);
        System.out.println("Inorder Traversal Below");
        in(root);
    }

    // preorder traversal (root-LR)
    public static void pre(TreeNode node) {
        if (node != null) {
            System.out.println(node.val);
            pre(node.left);
            pre(node.right);
        }
    }

    // postorder traversal(LR-root)
    public static void post(TreeNode node) {
        if (node != null) {
            post(node.left);
            post(node.right);
            System.out.println(node.val);
        }
    }

    // inorder traversal (L-root-R)
    public static void in(TreeNode node) {
        if (node != null) {
            in(node.left);
            System.out.println(node.val);
            in(node.right);

        }
    }
    // maximum depth of binary tree

}
