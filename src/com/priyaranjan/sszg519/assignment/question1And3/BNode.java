package com.priyaranjan.sszg519.assignment.question1And3;

public class BNode{
	protected int data;
	protected BNode left, right;
	public BNode(){
		left = right = null;
	}
	public BNode(int data){
		this(data,null,null);
	}
	public BNode(int data, BNode left, BNode right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.valueOf(data);
	}
}
