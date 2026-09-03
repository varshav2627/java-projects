package day_12;

public class demo0 {
	static boolean hasCycle(int[][]graph,int node,
			int parent,boolean[]visited) {
		visited[node]=true;
		for(int neighour:graph[node]) {
			if(! visited[neighour]) {
				if(hasCycle(graph,neighour,node,visited))
					return true;
			}
			else if(neighour !=parent) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[]args) {
		int[][]graph= {
				{1,2},
				{0,2},
				{0,1}
		};
		boolean[]visited=new boolean[3];
		if(hasCycle(graph,0,-1,visited))
			System.out.println("cycle exists");
		else
			System.out.println("no cycle");
	}

}
