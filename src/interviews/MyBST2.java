package interviews;

public class MyBST2 {
	
   Node _root;
	
   private class Node{
	   Node _left;
	   Node _right;
	   int _data;
	   
	   Node(Node left, Node right, int data){
		   _left = left;
		   _right = right;
		   _data = data;
	   }
   }   
 
   public void insertItem(int data){
	   if(_root == null){
		   _root = new Node(null, null, data);
	   }else{
		   insert(_root,data);
	   }
   }
   
   public void insert(Node root, int data){	   
		   if(data < root._data){
			   if(root._left!=null)
			   insert(root._left, data);
			   else
			   root._left = new Node (null,null,data);
		   }else if(data > root._data){
			   if(root._right!=null)
			   insert(root._right, data);
			   else
			   root._right = new Node (null,null,data);
		   }else{
			   return;
		   }
   }
   
//   public void add(int item) {
//       if (root == null) {
//           root = new TreeNode(null, item, null);
//           return;
//       }
//
//       TreeNode node = root;
//       while (true) {
//           if (item < node.item) {
//               if (node.left == null) {
//                   node.left = new TreeNode(null, item, null);
//                   break;
//               }
//               node = node.left;
//           } else if(item > node.item) {
//               if (node.right == null) {
//                   node.right = new TreeNode(null, item, null);
//                   break;
//               }
//               node = node.right;
//           } else{
//           	break;
//           }
//       }
//   }
   
   
   public static void main(String[] args){
	   
   }
   
}
