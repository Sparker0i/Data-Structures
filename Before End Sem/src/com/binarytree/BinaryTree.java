package com.binarytree;

public class BinaryTree {
	public Integer[] a;
	public int size;
	
	public BinaryTree() {
		a = new Integer[100];
		size = -1;
	}
	
	public BinaryTree add(int n) {
		a[++size] = n;
		return this;
	}
	
	public int delete(int n) {
		int pos = -1;
		for (int i = 0; i < a.length; ++i) {
			if (a[i] == n) {
				pos = i;
				break;
			}
		}
		if (pos == -1)
			return -1;
		else {
			int t = a[pos];
			for (int i = pos; a[i]!= null; ++i) {
				a[i] = a[i +  1];
			}
			a[size--] = null;
			return t;
		}
	}
	
	public void preorder() {
		for (int i = 0; a[i] != null; ++i) {
			System.out.print(a[i] + " ");
		}
	}
}
