package day07;

import java.util.Scanner;

public class Ch03Ex03 {

	public static void main01(String[] args) {
//	1. 4
	}

	public static void main02(String[] args) {
//	2. 4
	}

	public static void main03(String[] args) {
//	3. 3
	}

	public static void main04(String[] args) {
//	4. 2
	}

	public static void main05(String[] args) {
//	5. 1
	}

	public static void main06(String[] args) {
//	6. 
//	(1)
//	Class TV{
//		private int size;
//		private String manufacturer;
		
//		public TV() {
//			this(32,"LG");
//		}
		
//		public TV(String manufacturer) {
//			this(32,manufacturer);
//		}
		
//		public TV(int size, String manufacturer) {
//			this.size = size;
//			this.manufacturer = manufacturer;
//			System.out.println(size + "인치 "+manufacturer);
//		}
//	}
//	(2)
//	new TV(); = 32인치 LG
//	new TV("삼성"); = 32인치 삼성

//	(3)
//	TV tv = new TV(65,"삼성");

//	(4)
//	코드의 중복성을 줄일 수 있음
	}

	public static void main07(String[] args) {
//	7.
//	private를 사용하였으니 setter 와 getter 메서드를 사용해야한다.
	}

	public static void main08(String[] args) {
//	8.
//	(1)
//	Class Power{
//		public int kick;
//		public int punch;
//		

//		public Power(int kick, int punch) {
//			this.kick = kick;
//			this.punch = punch;
//		}
//	}
//	public class Example{
//		public static void main(String[] args) {
//			Power robot = new Power(10,20);
//		}
//	}
		
//	(2)
//	Class Power{
//		private int kick;
//		private int punch;
//		
//	public void Power(int kick, int punch) {
//		this.kick = kick;
//		this.punch = punch;
//	}
		
//	public class Example{
//		public static void main(String[] args) {
//			Power robot = new Power();
//			robot.Power(10, 20);
//		}
//	}
	}

	public static void main09(String[] args) {
//	9. 소멸시킬, 다행한, 레퍼런스, 가비지, 가비지컬렉션, System.gc()
	}

	public static void main10(String[] args) {
//	10.
//	(1) s가 가리키던 new String("Hello"+n);가 실행될 때마다 가비지 발생
//	(2) 가비지 발생하지 않음
	}

	public static void main11(String[] args) {
//	11. 4

	}

	public static void main12(String[] args) {
//	12. 1
	}

	public static void main13(String[] args) {
//	13. 
//	f() 메서드를 static 타입으로 바꿔준다.
//	class Test{
//		public static int f(int a, int b) {
//			return a+b;
//		}
//	}

	}

	public static void main14(String[] args) {
//	14. 
//	1) x++ : final은 상수이므로 변경 불가 
//	2) extends Rect : final클래스는 상속 불가
//	3) public void f() {
//		System.out.println(super.x);
//	}
//	 : final메서드는 재정의 불가 
	}

	public static void main15(String[] args) {
//	15.
//	가비지란 참조하는 레퍼런스를 잃어버린 즉, 더이상 사용되지 않는 메모리이다. 

//	가비지 컬렌션이 필요한 이유 : 가비지가 메모리 공간을 불필요하게 차지하기 때문에 필요하다. 
//	장점 : 가비지를 줄여 가용 메모리의 양을 늘릴 수 있다.
//	단점 : 가비지 컬렉션이 수행되는 정확한 시점을 알 수가 없고, 성능저하의 원인이 되는 오버헤드를 일으킨다.
	}

	public static void main16(String[] args) {
// 16. o		o	x
//	   x		x	x	
	}
}
