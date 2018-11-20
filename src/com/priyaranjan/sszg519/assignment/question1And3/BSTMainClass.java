package com.priyaranjan.sszg519.assignment.question1And3;

public class BSTMainClass {
	public static void main(String[] args) {
           BinarySearchTree bsTree = new BinarySearchTree();
           bsTree.insertData(20);
           bsTree.insertData(14);
           bsTree.insertData(10);
           bsTree.insertData(40);
           bsTree.insertData(21);
           bsTree.insertData(60);           
           bsTree.insertData(24);
           bsTree.insertData(50);
           bsTree.insertData(70);
           bsTree.insertData(17);
           bsTree.insertData(15);
           bsTree.insertData(18);  
           System.out.println("Level Order : ");
           bsTree.printLeveOrderTraversalTree();
           System.out.println("Zig-Zag Level Order: ");
           bsTree.printZigZagTree();
           System.out.println("Mirror Image: ");
           bsTree.convertMirrorImage();
           //Again reverting the tree to normal
           bsTree.convertMirrorImage();
           System.out.println("Level Order again: ");
           bsTree.printLeveOrderTraversalTree();
	}
}
