//Graph->it is the data structure used to represent the connection between the object.
package day_12;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class demo {
	 static boolean isBipartite(int[][]graph) {
		 int n=graph.length;
		 //
		 int []color=new int[n];
		 Arrays.fill(color, -1);
		 Queue<Integer>queue=new LinkedList<>();
		 for(int start=0;start<n;start++) {
			 if(color[start]!=-1)
				 continue;
			 //Give first color
			 color[start]=0;
			 queue.add(start);
			 while(!queue.isEmpty()) {
				 int current=queue.poll();
				 for(int next:graph[current]) {
					 //if not found
					 if(color[next]==-1) {
						 //give opposite color
						 color[next]=1-color[current];
						 
						 queue.add(next);
					 }
					 //same color=not bipartite
					 else if(color[next]==color[current]) {
						 return false;
					 }
				 }
			 }
		 }
		 return true;
		 }
	 public static void main(String[]args) {
		 int[][]graph= {
				 {1,2},
				 {0,3},
				 {0,3},
				 {1,2}
		 };
		 System.out.println(isBipartite(graph));
	 }

}
