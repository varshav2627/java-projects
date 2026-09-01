
package day_10;

public class demo01 {
	public static void main(String[] args) {
		String[] job = {"J1", "J2", "J3"};
		int[] deadline = {2, 1, 2};
		int[] profit = {100, 50, 20};

		String[] slot = new String[2]; // max deadline = 2
		int totalProfit = 0;

		for (int i = 0; i < job.length; i++) {
			for (int t = deadline[i] - 1; t >= 0; t--) {
				if (slot[t] == null) {
					slot[t] = job[i];
					totalProfit += profit[i];
					break;
					}
				}
			}

			System.out.println("Job sequence:");
			for (String s : slot) {
				if (s != null) {
					System.out.println(s);
				}
			}
			System.out.println("Total profit: " + totalProfit);
		}
	}


