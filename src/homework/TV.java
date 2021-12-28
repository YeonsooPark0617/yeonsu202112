package homework;

public class TV {
	String manufacture;
	int year;
	int inch;
	
	public TV(String manufacture, int year, int inch) {
		this.manufacture = manufacture;
		this.year = year;
		this.inch = inch;
	}
	
	public void show() {
		System.out.printf("%s에서 만든 %d년 %d인치 TV", manufacture, year, inch);
	}
	
	public static void main(String[] args) {
		TV myTV = new TV("LG", 2014, 32); //LG에서 만든 2017년 32인치
		myTV.show();
	}
}
