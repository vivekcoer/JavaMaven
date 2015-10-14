package interviews;

public class CreateBinarySearchTree {

    private TreeNode root;

    public CreateBinarySearchTree() {
    }

    /**
     * Will create a BST imperative on order of elements in the array
     */
    public CreateBinarySearchTree(int[] a) {
        this();
        for (int i : a) {
            add(i);
        }
    }

    private class TreeNode {
        TreeNode left;
        int item;
        TreeNode right;

        TreeNode(TreeNode left, int item, TreeNode right) {
            this.left = left;
            this.right = right;
            this.item = item; 
        }
    }

    public void add(int item) {
        if (root == null) {
            root = new TreeNode(null, item, null);
            return;
        }

        TreeNode node = root;
        while (true) {
            if (item < node.item) {
                if (node.left == null) {
                    node.left = new TreeNode(null, item, null);
                    break;
                }
                node = node.left;
            } else if(item > node.item) {
                if (node.right == null) {
                    node.right = new TreeNode(null, item, null);
                    break;
                }
                node = node.right;
            } else{
            	return;
            }
        }
    }
    
    public void add(int... items) {
        for (int item : items) {
            add(item);
        }
    }
    
    // recursive awesome!
    
    public void addRec(int item) {
        if (root == null) {
            root = new TreeNode(null, item, null);
        } else {
            add(root, item);
        }
    }

    public void add(TreeNode node, int item) {
        if (item < node.item) {
            if (node.left == null) {
                node.left = new TreeNode(null, item, null);
            } else {
                add(node.left, item);
            }
        } else if (item > node.item) {
            if (node.right == null) {
                node.right = new TreeNode(null, item, null);
            } else {
                add(node.right, item);
            }
        } else{
        	return;// 
        }
    }
    
    //another way!
    
    public void insert(int data)
    {
       root = insert(root, data);
    }
    
    private TreeNode insert(TreeNode p, int item)
    {
       if (p == null)
    	   return new TreeNode(null, item, null);
          //return new Node<T>(item);

       if (item == p.item)
       	return p;

       if (item < p.item)
          p.left = insert(p.left, item);
       else
          p.right = insert(p.right, item);

       return p;
    }
    
    @Override
    public String toString() {
        return toString(root);
    }

    private String toString(TreeNode node) {
        if (node == null) {
            return null;
        }
        return "[" + toString(node.left) + "," + node.item + "," + toString(node.right) + "]";
    }    
    
}