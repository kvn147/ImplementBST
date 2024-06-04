public class IntTree {
    
    private TreeNode<Integer> overallRoot;

    // constructor
    public IntTree(TreeNode<Integer> root) {
        overallRoot = root;

    }

    // print out all the nodes in the tree in a preorder
    // traversal sequence
    public void printPreorder() {
        System.out.print("Pre Order: ");
        // call a recursive helper method
        printPre(overallRoot);
    }

    // create recursive method which will traverse the tree
    // in preorder sequence
    private void printPre(TreeNode<Integer> root) {
        // base case
        if (root == null) {
            return;
        }
        // if root is not null
        System.out.print(root.data + " ");
        // recurse left
        printPre(root.left);
        // recurse right
        printPre(root.right);
    }

    // print out all the nodes in the tree in inorder
    // traversal sequence
    public void printInorder() {
        System.out.print("In Order: ");
        // call a recursive helper method
        printIn(overallRoot);
    }

    // create recursive method which will traverse the tree
    // in inorder sequence
    private void printIn(TreeNode<Integer> root) {
        // base case
        if (root == null) {
            return;
        }
        // if root is not null
        printIn(root.left);
        System.out.print(root.data + " ");
        printIn(root.right);
    }

    // print out all the nodes in the tree in postorder
    // traversal sequence
    public void printPostorder() {
        System.out.print("Post Order: ");
        // call a recursive helper method
        printIn(overallRoot);
    }

    // create recursive method which will traverse the tree
    // in postorder sequence
    private void printPost(TreeNode<Integer> root) {
        // base case
        if (root == null) {
            return;
        }
        // if root is not null
        printPost(root.left);
        printPost(root.right);
        System.out.print(root.data + " ");
    }



}
