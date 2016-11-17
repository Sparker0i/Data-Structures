package com.binarytree;

import java.util.Scanner;

public class Driver {
	public static void println(String x) {
		System.out.println(x);
	}
	
	public static void print(String x) {
		System.out.print(x);
	}
	
	public static void main(String... args) {
		char ch = 'Y';
		BinaryTree bt = new BinaryTree();
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
					bt = bt.add(n);
					break;
			case 2 :print("Enter a number to be deleted : ");
					n = scan.nextInt();
					int u = bt.delete(n);
					if (u == -1)
						println("Either NULL or NOT FOUND or EMPTY");
					else
						println(u + " has been deleted");
					break;
			case 3 :break;
			case 4 :bt.preorder();
					break;
			default:println("What option is this? I am out of the world");
			}
		}
		scan.close();
	}
}
