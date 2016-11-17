package com.graph;

import java.util.Scanner;

public class Driver {
	public static void println(String s) {
    	System.out.println(s);
    }
    
    public static void print(String s) {
    	System.out.print(s);
    }
    
	public static void main(String args[]) 
    {
        int v, e, count = 1, to = 0, from = 0;
        Scanner sc = new Scanner(System.in);
        Graph graph = null;
        char ch = 'Y';
        do {
        	println("MENU : ");
        	println("1. Initialize Graph");
        	println("2. Add A Vertex");
        	println("3. Display");
        	println("4. Display Degree of Node i");
        	println("5. Breadth First Search");
        	println("6. Depth First Search");
        	print("ENTER CHOICE : ");
        	int ans = sc.nextInt();
        	switch (ans) {
				case 1: println("Enter the last possible integer in the graph: ");
						v = sc.nextInt();
						graph = new Graph(v);
						break;
				case 2: println("Enter the edges: <to> <from>");
						to = sc.nextInt();
						from = sc.nextInt();
						graph.addVertex(to , from);
						break;
				case 3: graph.display();
						break;
				case 4: print("Enter i : ");
						int i = sc.nextInt();
						graph.degree(i);
						break;
				case 5: print("Enter Source : ");
						to = sc.nextInt();
						graph.bfs(to);
						break;
				case 6: print("Enter Source : ");
						to = sc.nextInt();
						graph.dfs(to);
						break;
				default:println("INVALID CHOICE");
		    }
		    print("ENTER MORE : ");
		    ch = sc.next().charAt(0);
        }
        while (ch == 'Y' || ch == 'y');
        sc.close();
    }
}