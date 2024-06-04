public class TreeTester {
    
    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<>(4);
        root.left = new TreeNode<>(2);
        root.left.left = new TreeNode<>(1);
        root.left.right = new TreeNode<>(3);
        root.right = new TreeNode<>(5);
        System.out.println(root);

        // construct the binary tree with IntTree constructor
        IntTree overallRoot = new IntTree(root);

    }
}
