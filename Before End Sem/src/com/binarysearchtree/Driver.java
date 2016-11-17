package com.binarysearchtree;

import java.util.Scanner;

import com.mlink.*;

public class Driver {
	static Link root;
	
	public static void println(String x) {
		System.out.println(x);
	}
	
	public static void print(String x) {
		System.out.print(x);
	}
	
	public static void main(String... args) {
		char ch = 'Y';
		BinarySearchTree bt = new BinarySearchTree();
		int n;
		Scanner scan = new Scanner(System.in);
		while (ch == 'Y' || ch == 'y') {
			println("\n\n");
			println("MENU");
			println("1. Add an Element");
			println("2. Delete an Element");
			println("3. Search for an Element");
			println("4. Preorder Traversal");
			print("Enter Your Choice : ");
			int c = scan.nextInt();
			switch (c) {
			case 1 :print("Enter a number : ");
					n = scan.nextInt();
					root = bt.add(root , n);
					break;
			case 2 :print("Enter a number to be deleted : ");
					n = scan.nextInt();
					Link u = bt.deleteNode(root , n);
					if (u == null)
						println("Either NULL or NOT FOUND or EMPTY");
					else
						println(n + " has been deleted");
					break;
			case 3 :break;
			case 4 :bt.preorder(root);
					break;
			default:println("What option is this? I am out of the world");
			}
		}
		scan.close();
	}
}
