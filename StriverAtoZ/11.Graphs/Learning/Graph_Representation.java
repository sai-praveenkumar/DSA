// Matrix Representation : Undirected 
package graph;
import java.util.*;
public class MatrixRepresentation_Undirected {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		int vertices= Sc.nextInt();
		int edges= Sc.nextInt();
		int[][] matrix = new int[vertices+1][vertices+1];
		for(int i=0;i<edges;i++) {
			int u,v;
			u= Sc.nextInt();
			v=Sc.nextInt();
			matrix[u][v]=1;
			matrix[v][u]=1;
		}
		System.out.println("The edges present are :");
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				if(matrix[i][j]==1) {
					System.out.println(i+"->"+j);
				}
			}
		}
	}
}

// Matrix Representation : Directed
package graph;
import java.util.*;
public class MatrixRepresentation_Directed {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		int vertices= Sc.nextInt();
		int edges= Sc.nextInt();
		int[][] matrix = new int[vertices+1][vertices+1];
		for(int i=0;i<edges;i++) {
			int u,v;
			u= Sc.nextInt();
			v=Sc.nextInt();
			matrix[u][v]=1;
		}
		System.out.println("The edges present are :");
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				if(matrix[i][j]==1) {
					System.out.println(i+"->"+j);
				}
			}
		}
	}
}

// Adjacency List : UnDirected
package graph;
import java.util.*;
public class ListRepresentation_Undirected {
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		int n=Sc.nextInt();
		int m=Sc.nextInt();
		ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
		for(int i=0;i<=n;i++) {
			adj.add(new ArrayList<Integer>());
		}
		for(int i=0;i<m;i++) {
			int u,v;
			u=Sc.nextInt();
			v=Sc.nextInt();
			addEdge(adj,u,v);
		}
		printgraph(adj);
	}

	private static void printgraph(ArrayList<ArrayList<Integer>> adj) {
		for(int i=0;i<adj.size();i++) {
			System.out.println("Adjacency List of vertex "+i+" is :");
			System.out.print("head");
			for(int j=0;j<adj.get(i).size();j++) {
				System.out.print("->"+adj.get(i).get(j));
			}
			System.out.println("-> null");
		} 
		
	}

	private static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
		adj.get(u).add(v);
		adj.get(v).add(u);
	}
	
}

// Adjacency List : Directed
package graph;

import java.util.*;
public class ListRepresentation_Directed {

	public static void main(String[] args) {
		Scanner Sc= new Scanner(System.in);
		int vertices=Sc.nextInt();
		int edges= Sc.nextInt();
		List<List<Integer>> ans= new ArrayList<>();
		for(int i=0;i<=vertices;i++) {
			ans.add(new ArrayList<>());
		}
		for(int i=0;i<edges;i++) {
			int u,v;
			u=Sc.nextInt();
			v=Sc.nextInt();
			addEdge(ans,u,v);
		}
		printgraph(ans);

	}
	private static void printgraph(List<List<Integer>> adj) {
		for(int i=0;i<adj.size();i++) {
			System.out.println("Adjacency List of vertex "+i+" is :");
			System.out.print("head");
			for(int j=0;j<adj.get(i).size();j++) {
				System.out.print("->"+adj.get(i).get(j));
			}
			System.out.println("-> null");
		}
		
	}

	private static void addEdge(List<List<Integer>> ans, int u, int v) {
		ans.get(u).add(v);
		
	}

}

// Follow up Q : https://www.geeksforgeeks.org/problems/print-adjacency-list-1587115620/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=print-adjacency-list
class Solution {
    public List<List<Integer>> printGraph(int V, int edges[][]) {
        List<List <Integer>> ans = new ArrayList<>();
        for(int i=0;i<V;i++){
            ans.add(new ArrayList<Integer>());
        }
        for(int i=0;i<edges.length;i++){
                addEdge(ans,edges[i][0],edges[i][1]);
        }
        return ans;
    }
    public void addEdge(List<List <Integer>> adj, int u, int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
}