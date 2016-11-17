package com.graph;

import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class Graph 
{
    private final int vertices;
    private int[][] matrix;
    private int count;
    private Queue<Integer> queue;
    private Stack<Integer> stack;

    public Graph(int v) 
    {
        vertices = v;
        count = 0;
    	matrix = new int[vertices + 1][vertices + 1];
    	queue = new LinkedList<Integer>();
    	stack = new Stack<Integer>();
    }
    
    public void makeEdge(int to, int from, int edge) 
    {
        matrix[to][from] = edge;
    }
    
    public int getEdge(int to, int from) 
    {
        return matrix[to][from];
    }
    
    public void display() {
    	int v = vertices;
    	System.out.println("The adjacency matrix for the given graph is: ");
        System.out.print("   ");
        for (int i = 1; i <= v; i++)
            if (i <= 9)
            	System.out.print(i + "  ");
            else
            	System.out.print(i + " ");
        System.out.println();
        for (int i = 1; i <= v; i++) 
        {
        	if (i <= 9)
            	System.out.print(i + "  ");
            else
            	System.out.print(i + " ");
            for (int j = 1; j <= v; j++)
                	System.out.print(getEdge(i, j) + "  ");
            System.out.println();
        }
    }
    
    public void degree(int k) {
    	int count = 0;
    	System.out.print("Nodes : {");
    	for (int j = 1; j <= vertices; ++j) {
    		if (matrix[k][j] == 1)
    		{	System.out.print(j + ", ");
    			++count;
    		}
    	}
    	System.out.println("}");
    	System.out.println("No. of nodes : " + count);
    }
    
    public void addVertex(int to , int from) {
        makeEdge(to, from, 1);
        makeEdge(from, to, 1);
        if (matrix[to][from] == 0 && matrix[from][to] == 0)
        	count++;
    }
    
    public void bfs(int source)
    {
        int N = matrix[source].length - 1;
        int[] visited = new int[N + 1];
        int i, element, j = 1;
        visited[source] = 1;
        queue.add(source);
        while (j < source)
        {
            if (matrix[source][j] == 1 && visited[j] == 0)
            {
                queue.add(j);
                visited[j] = 1;
            }
            j++;
        }
        while (!queue.isEmpty())
        {
            element = queue.remove();
            i = element;
            System.out.print(i + "\t");
            while (i <= N)
            {
                if (matrix[element][i] == 1 && visited[i] == 0)
                {
                    queue.add(i);
                    visited[i] = 1;
                }
                i++;
            }
        }
    }
    
    public void dfs(int source)
    {
        int N = matrix[source].length - 1;
        int visited[] = new int[N + 1];		
        int element = source;		
        int i = source, j = 1;		
        System.out.print(element + "\t");		
        visited[source] = 1;		
        stack.push(source);
        while (j < i)
		{
	     	if (matrix[element][j] == 1 && visited[j] == 0)
		    {
	            stack.push(j);
	            visited[j] = 1;
	            element = j;
	            j = 1;
	            System.out.print(element + "\t");
		        continue;
	        }
	        j++;
		}
        while (!stack.isEmpty())
        {
		    element = stack.peek();
		    i = element;	
			while (i <= N)
			{
		     	if (matrix[element][i] == 1 && visited[i] == 0)
			    {
		            stack.push(i);
		            visited[i] = 1;
		            element = i;
		            i = 1;
		            System.out.print(element + "\t");
			        continue;
		        }
		        i++;
			}
		    stack.pop();	
        }	
    }
}