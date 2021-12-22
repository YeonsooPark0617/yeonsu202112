package org.comstudy21.miniproj;

public class Circle {
	int radius;
	String name;
	
	public Circle() { //매개변수 없는 생성자
		radius = 1; name = ""; 
	}
	
	public Circle(int r, String n) { //매개 변수를 가진 생성자
		radius = r; name = n;
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}
	
	

	public static void main(String[] args) {
		Circle pizza = new Circle(10, "자바피자");  //Circle객체생성, 반지름 10
		
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);
		
		Circle donut = new Circle(); //Circle객체생성, 반지름 1
		donut.name = "도넛피자";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 " + area);
		
	}

}
