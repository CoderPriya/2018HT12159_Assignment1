package com.priyaranjan.sszg519.assignment.question1And3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
	protected BNode root = null;
	public BinarySearchTree(){		
	}
	
	public void insertData(int data){
		BNode theRoot = root;
		BNode prev = null;				
		while(theRoot != null){
			prev = theRoot;
			if(theRoot.data - data < 0){
				theRoot = theRoot.right;
			}else{
				theRoot = theRoot.left;
			}
		}
		if(root == null){
			root = new BNode(data);
		}
		else if(prev.data - data < 0){
			prev.right = new BNode(data);
		}else{
			prev.left = new BNode(data);
		}
	}
	public void printLeveOrderTraversalTree(){
		BNode theRoot = root;
		if(theRoot == null){
			System.out.println("The tree is empty");
			return;
		}
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		Queue<BNode> queue = new LinkedList<>();
		queue.offer(theRoot);
		queue.offer(null);
		ArrayList<Integer> current = new ArrayList<>();
		while(!queue.isEmpty()){
			BNode tmpNode = queue.poll();
			if(tmpNode != null){
				current.add(tmpNode.data);
				if(tmpNode.left != null){
					queue.offer(tmpNode.left);
				}
				if(tmpNode.right != null){
					queue.offer(tmpNode.right);
				}
			}else{
				ArrayList<Integer> c_current = new ArrayList<>(current);
				res.add(c_current);
				current.clear();
				//completion of level
				if(!queue.isEmpty()){
					queue.offer(null);
				}
			}
		}
		System.out.println(res);
	}
	public void printZigZagTree(){
		BNode theRoot = root;
		if(theRoot == null){
			System.out.println("The tree is empty");
			return;
		}
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		Queue<BNode> queue = new LinkedList<>();
		queue.offer(theRoot);
		queue.offer(null);
		boolean leftToRight = true;
		ArrayList<Integer> current = new ArrayList<>();
		while(!queue.isEmpty()){
			BNode tmpNode = queue.poll();			
			if(tmpNode != null){
				current.add(tmpNode.data);
				if(tmpNode.left != null){
					queue.offer(tmpNode.left);
				}
				if(tmpNode.right != null){
					queue.offer(tmpNode.right);
				}
			}else{
				if(leftToRight){
					ArrayList<Integer> c_current = new ArrayList<>(current);
					res.add(c_current);
					current.clear();
				}else{
					LinkedList<Integer> stack = new LinkedList<>();
					stack.addAll(current);
					ArrayList<Integer> c_current = new ArrayList<>();
					while(!stack.isEmpty()){
						c_current.add(stack.removeLast());
					}
					res.add(c_current);
					current.clear();
				}
				//completion of level
				if(!queue.isEmpty()){
					queue.offer(null);
					leftToRight = !leftToRight;
				}
			}
		}
		System.out.println(res);
	}
	
	
	void convertMirrorImage(){
		BNode theRoot = root;
		if(theRoot == null){
			System.out.println("The tree is empty");
			return;
		}		
		convertMirrorImage(theRoot);
		this.printLeveOrderTraversalTree();		
	}

	private void convertMirrorImage(BNode root) {
		if(root != null){
			BNode bNodeTemp = root.left;
			root.left = root.right;
			root.right = bNodeTemp;			
			convertMirrorImage(root.left);
			convertMirrorImage(root.right);
		}
			
		
		
	}

}
