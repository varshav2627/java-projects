//priority queue
package day_9;

import java.util.PriorityQueue;

class Patient{
	int priority;
	String name;
	Patient(String name,int priority){
		this.name=name;
		this.priority=priority;
	}
	public Patient(String string) {
		// TODO Auto-generated constructor stub
	}

}
public class demo01 {
	public static void main(String[]args) {
		//smaller number=high priority
		PriorityQueue<Patient>queue=
				new PriorityQueue<>(
						(p1,p2)-> p1.priority-p2.priority
						);
		//add patients
		queue.add(new Patient("Anand,2"));
		queue.add(new Patient("Rahul,3"));
		queue.add(new Patient("Priya,0"));
		queue.add(new Patient("John,8"));
		//treat patients 
		while(! queue.isEmpty()) {
			Patient p=queue.poll();
			System.out.println(
					p.name + "-Priority"+ p.priority
					);
		}



		
		
				
	}
	
}
