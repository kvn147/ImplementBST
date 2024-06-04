

// Tree Generic
public class TreeNode<E> {

    public E data; // data stored at node
    public TreeNode<E> left; // left child
    public TreeNode<E> right; // right child

    // 1 parameter constructor initialize the data and set the left and right child to null
    public TreeNode(E data) {
        this(data, null, null);
    }

    // 3 parameter constructor needed for the class above
    public TreeNode(E data, TreeNode <E> left, TreeNode<E> right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }


}