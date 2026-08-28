package day;

public class runnableinterface { 
	public void run() {
        int n = 4, sum = 0;
        for (int i = 1; i <= n; i++)
            sum += i;
        System.out.println("Sum = " + sum);
    }

    public static void main(String[] args) {
        Thread t = new Thread(new Sum());
        t.start();
    }

}
