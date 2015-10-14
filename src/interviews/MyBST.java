package interviews;

import java.util.ArrayList;
import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

public class MyBST {
	
	private Node _root;
	
	protected class Node{
		Node _left;
		Node _right;
		int _data;
		
		Node(Node left, Node right, int data){
			_left = left;
			_right = right;
			_data = data;
		}
	}
	
	MyBST(int... arr){
		for(int i: arr){
			add(i);
		}		
	}
	
	public void add(int data){
		if(_root == null){
			_root = new Node(null,null,data);
		}else{
			add(_root,data);
		}
	}
	
	public void add(Node root, int data){
		if(data<root._data){
			if(root._left!=null){
				add(root._left,data);
			}else{
				root._left = new Node(null,null,data);
			}
		}else if(data>root._data){
			if(root._right!=null){
				add(root._right,data);
			}else{
				root._right = new Node(null,null,data);
			}
		}else{
			return;
		}
	}
	
	public void inordertraverse(){		
		traverse(_root);		
	}
	
	public void traverse(Node root){
		if(root._left!=null){
			traverse(root._left);
		}
		
		//root
		System.out.println(root._data);
		
		if(root._right!=null){
			traverse(root._right);
		}		
	}
	
	//now do it non-recrusively!
	
	public void _traverse(){
		Node root = _root;
		while(true){
			if(root._left!=null){
				root = root._left;
			}else{
				break;
			}
		}
	}
	
    public static void main(String args[]){   
    	int[] arr = {57, 42, 72, 40, 49, 66, 78, 46, 50, 67, 77, 83, 82};
    	MyBST obj = new MyBST(arr);    	
    	obj.inordertraverse();
    }
}
