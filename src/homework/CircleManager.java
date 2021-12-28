package homework;

import java.util.Scanner;

class Circle{
	private double x,y;
	private int radius;

	public Circle(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public void show() {
		System.out.printf("(%.1f,%.1f)%d\n", x, y, radius);
	}
	
	public int radiusSize() {
		return radius;
	}
}

public class CircleManager {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Circle c[] = new Circle[3];
		for(int i =0; i<c.length; i++) {
			System.out.print("x, y, radius >>");
			double x = scanner.nextDouble();
			double y = scanner.nextDouble();
			int radius = scanner.nextInt();
			c[i] = new Circle(x,y,radius);
		}
		
		int max = 0;
		int index = 0;
		for(int i=0; i<c.length; i++) {
			if(max < c[i].radiusSize()) {
				max = c[i].radiusSize();
				index = i;
			}
		}
		System.out.print("가장 면적이 큰 원은 ");
		c[index].show();
		scanner.close();
	}
}
