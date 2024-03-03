package past_1_practice;

public class p1 {

	public static void main(String[] args) {
		long[] n  = {1000000,2000000,3000000,4000000, 5000000, 6000000};
		for(int i = 0; i < n.length; i++) {
			System.out.println("\n"+n[i]);
			ex1(n[i]);
			ex2(n[i]);
			ex3(n[i]);
		}
	}	
	
	public static void ex1(long n) {
		long sum = 0;
		double t = System.currentTimeMillis();
		for(int j = 0; j < n; j++) {
			for(int k = 0; k < j; k++) {
				sum++;
			}
		}
		t = System.currentTimeMillis() - t;
		System.out.println(t + "ms");
		System.out.println("res: " + sum);
	}
	
	public static void ex2(long n) {
		long sum = 0;
		long t = System.currentTimeMillis();
		for(int j = 0; j < n; j++) {
			sum = sum +(j+1);
		}
		t = System.currentTimeMillis() - t;
		System.out.println(t + "ms");
		System.out.println("res: " + sum);
		
	}
	
	public static void ex3(long n) {
		long sum = 0;
		long t = System.currentTimeMillis();
		sum = n*(n+1)/2;
		t = System.currentTimeMillis() - t;
		System.out.println(t + "ms");
		System.out.println("res: " + sum);
	}
	
	
	
	
}
