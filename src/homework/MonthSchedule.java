package homework;

import java.util.Scanner;

class Day{
	private String work;
	public void set(String work) {this.work = work;}
	public String get() {return work;}
	public void show() {
		if(work == null) System.out.println("없습니다.");
		else System.out.println(work + "입니다.");
	}
}


public class MonthSchedule {
	Scanner scan = new Scanner(System.in);
	Day[] dayArr;
	
	public MonthSchedule(int day) {
		this.dayArr = new Day[day];
		for(int i=0; i<dayArr.length; i++) {
			dayArr[i] = new Day();
		}
		
	}
	
	public void input() {
		System.out.print("날짜(1~30)?");
		int num = scan.nextInt();
		System.out.print("할일(빈칸없이입력)?");
	}
	
	public void view() {
		System.out.print("날짜(1~30)?");
		int num = scan.nextInt();
	}
	
	public void finish() {
		System.out.println("프로그램을 종료합니다.");
	}
	
	public void run() {
		System.out.println("이번달 스케쥴 관리 프로그램.");
		while(true) {
			System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>");
			int num = scan.nextInt();
			switch(num) {
			case 1: 
				input();
				break;
			case 2: 
				view();
				break;
			case 3:
				finish();
				break;
			}
		}
		
	}

	
	public static void main(String[] args) {
		MonthSchedule april = new MonthSchedule(30); 
		april.run();
	}

}
