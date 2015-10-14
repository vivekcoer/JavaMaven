package interviews;

import java.util.LinkedList;
import java.util.List;

public class MyBST3 {
	
	Node _root;
	
	class Node{
		Node _left;
		Node _right;
		int _data;
		
		Node(Node left, Node right, int data){
			_left = left;
			_right = right;
			_data = data;
		}
		
	}
	
	class Stack{		
		int current = -1;		
		List<Node> stackList = new LinkedList<Node>();
		
		public void push(Node node){
			stackList.add(node);
			current ++;
		}
		
		public Node pull(){
			if(current<0){
				return null;
			}
			Node node = stackList.get(current);
			current--;
			return node;
		}				
	}
	
	public void add(Node root, int data){
		if (data<root._data){
			if(root._left!=null)
				add(root._left, data);
			else
				root._left = new Node(null,null,data);
		}else if(data>root._data){
			
		}else{
			
		}
	}

}
