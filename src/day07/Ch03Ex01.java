package day07;

import java.util.Scanner;

public class Ch03Ex01 {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
		int month = 0, day =0;
		int total = 0;
		int nextMonth, nextDay = 0;
		
		System.out.print("월 입력>> ");
		month = scan.nextInt();
		while(month<1 || month>12) {
			System.out.println("월 입력 오류: 범위를 벗어났습니다!");
			System.out.print("월 다시 입력(1~12사이)>> ");
			month = scan.nextInt();
		}
		
		
		System.out.print("일 입력>> ");
		day = scan.nextInt();
		while(day<1 || day> days[month-1]) {
			System.out.printf("일 입력 오류 : 해당월의 날짜는 %d일까지입니다.", days[month-1]);
			System.out.printf("일 다시 입력(1~%d사이)>> ", days[month-1]);
		}
		
		
		
		System.out.printf("%d월은 %d일까지 있다.\n", month, days[month-1]);
		System.out.printf("%d월의 남은 날짜는 %d일이다.\n", month, days[month-1]-day);
		  // 1월1일부터 입력날짜까지 total에 누적.
	      total = day;
	      for(int i=0; i<month-1; i++) {
	         total += days[i];
	      }
	      System.out.printf("1월 1일부터 %d월 %d일까지는 %d일 지났습니다.\n", month, day, total);
	      
			// 1년중 남은 날짜 구하기
			total = days[month - 1] - day;
			for (int i = month; i < days.length; i++) {
				total += days[i];
			}
			System.out.printf("%d월 %d일 이후 1년의 남은 날짜는 %d일입니다.\n", month, day, total);

			// 현재 달의 남은 날짜로 total 초기화
			System.out.print("며칠 후 날짜를 알고 싶나요? >>");
			int dd = scan.nextInt();
			total = dd;
			// 만약 현재 달의 남은 날짜보다 작은 숫자가 들어오면 그냥 현재달의 day+dd이다. 
			total = total - (days[month - 1] - day);
			int i = month % 12;
			for (; total > days[i]; i++, i %= 12) {
				total -= days[i];
			}

			nextMonth = i + 1;
			nextDay = total;
			System.out.println(dd + "일 후는 " + nextMonth + "월 " + nextDay + "일입니다.\n");
	}

}
