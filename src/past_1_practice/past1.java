package past_1_practice;

import java.awt.Color;

public class past1 {

	public static void main(String[] args) {

		long[] n  = {100000000,200000000,300000000,400000000, 500000000, 600000000};
		
		double[] time=new double[n.length];
		
		System.out.printf("%-12s %-6s\n","n" ,"time,ms");
		System.out.printf("--------------------\n");
		int sum = 0;
		for (int j = 0; j < n.length; j++) {
			double start = System.currentTimeMillis();
			
			// start
			for (int i = 0; i < n[j]; i++) {
				for(int k = 0; k < i;k++) {
					sum++;
				}
			}
			
			double t = (System.currentTimeMillis() - start);
			time[j]=t;
		}
		System.out.println(sum);
		
		StdDraw.setCanvasSize(800, 600);
		double xMin,xMax,yMin,yMax;
		xMin=xMax=n[0];
		yMin=yMax=time[0];
		for(int i=0;i<n.length;i++) {
			if (xMin>n[i])
				xMin=n[i];
			if(xMax<n[i])
				xMax=n[i];
			
			if(yMin>time[i])
				yMin=time[i];
			if(yMax<time[i])
				yMax=time[i];
		}
		
		System.out.println("X: "+xMin+","+xMax);
		System.out.println("Y: "+yMin+","+yMax);
		
		double dx=Math.abs(xMax-xMin);
		double dy=Math.abs(yMax-yMin);
		StdDraw.setXscale(xMin-0.05*dx, xMax+0.05*dx); 
		StdDraw.setYscale(yMin-0.05*dy, yMax+0.05*dy);
		
		StdDraw.setPenColor(Color.RED);
		StdDraw.setPenRadius(0.03);
		

		for(int i=0;i<n.length;i++) {
			StdDraw.point(n[i], time[i]);
			System.out.println(n[i]+","+time[i]);
		}

		StdDraw.setPenColor(Color.BLUE);
		StdDraw.setPenRadius(0.005);
		for(int i=1;i<n.length;i++) {
			StdDraw.line(n[i-1], time[i-1],n[i],time[i]);
		}
	}

}
