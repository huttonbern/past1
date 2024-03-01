package past_1_practice;

public class p1 {

	public static void main(String[] args) {
		int[] n  = {10000, 50000, 100000};
		for(int i = 0; i < n.length; i++) {
			System.out.println("\n"+n[i]);
			ex1(n[i]);
			ex2(n[i]);
			ex3(n[i]);
		}
	}	
	
	public static void ex1(int n) {
		int sum = 0;
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
	
	public static void ex2(int n) {
		int sum = 0;
		long t = System.currentTimeMillis();
		for(int j = 0; j < n; j++) {
			sum = sum +(j+1);
		}
		t = System.currentTimeMillis() - t;
		System.out.println(t + "ms");
		System.out.println("res: " + sum);
		
	}
	
	public static void ex3(int n) {
		int sum = 0;
		long t = System.currentTimeMillis();
		sum = n*(n+1)/2;
		t = System.currentTimeMillis() - t;
		System.out.println(t + "ms");
		System.out.println("res: " + sum);
	}
	
	
	
	
}
