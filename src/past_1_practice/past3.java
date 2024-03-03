package past_1_practice;

import java.awt.Color;

public class past3 {

	public static void main(String[] args) {

		long[] n  = {1000000,2000000,3000000,4000000, 5000000, 6000000};
		
		double[] time=new double[n.length];
		
		System.out.printf("%-12s %-6s\n","n" ,"time,ms");
		System.out.printf("--------------------\n");
		long sum;
		for (int j = 0; j < n.length; j++) {
			double start = System.currentTimeMillis();
			
			// start
			sum = (long)(n[j]*(n[j]+1)/2);
			
			double t = System.currentTimeMillis() - start;
			time[j]=t;
			System.out.println(n[j]+ " " +time[j]);
		}
	}

}