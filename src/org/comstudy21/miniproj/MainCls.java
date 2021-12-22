package org.comstudy21.miniproj;

import java.util.Scanner;

import static java.lang.System.out;

class Student {
	public int no; // 번호
	public String name; // 이름
	public int kor, eng, mat;
	public int sum; // 국영수의 총점
	public double avg; // 국영수 총점의 평균
	public String grade; // 학점
	public int rank; // 등수
	
	public Student() {
		// 디폴트생성자 - 인자가 없다. 아무일도 하지 않는다.
	}

	public Student(int no, String name, int kor, int eng, int mat) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		
		// 총점, 평균, 학점을 만들어준다.
		
		math();
		
		
		
	}
	
	
	public void math() {
		this.sum = this.kor + this.eng + this.mat;
		this.avg = this.sum / 3;
		
		if (avg >= 90) {
			this.grade = "A";
		} else if (avg >= 80) {
			this.grade = "B";
		} else if (avg >= 70) {
			this.grade = "C";
		} else if (avg >= 60) {
			this.grade = "D";
		} else {
			this.grade = "F";
		}
	}
	
	// 객체를 사용하면 toString()이 자동 호출 된다.
	@Override
	public String toString() {
		return no + "\t" + name + "\t" + kor + "\t" + eng + "\t" + mat + "\t"
				+ sum + "\t" + avg + "\t" + grade + "\t" + rank;
	}




}




// Student st1 = new Student();
// st1.name = "홍길동"
// Student st2 = new Student(1, "김길동", 60, 70, 80);

public class MainCls {
	public static final Scanner scan = new Scanner(System.in);
	
	public static final int MAX = 100;
	static Student[] sArr = new Student[MAX];
	static int top = 0; // 스택 자료구조처럼.
	static int sequence = 1;
	
	// static 초기화 블럭
	static {
		sArr[top++] = new Student(sequence++, "KIM", 60, 60, 75);
		sArr[top++] = new Student(sequence++, "LEE", 90, 80, 80);
		sArr[top++] = new Student(sequence++, "PARK", 90, 100, 95);
		Rank();
	}
	
	static int Index(String name) {
		int index=-1;
		for(int i=0; i<top; i++) {
			if(name.equals(sArr[i].name)) {
				index = i;
			}
		}
		return index;
	}
	
	static void Rank() {
		for(int i=0; i<top; i++) {
			int r = 1;
			for(int j=0; j<top; j++) {
				if(sArr[i].sum < sArr[j].sum) {
					r++;
				}
			}
			sArr[i].rank = r;
		}
	}
	
	
	
	
	
	public static int menu() {
		int no = 0;
		// 예외처리 및 유효성 검사
		while (true) {
			try {
				out.println("1.입력 2.출력 3.검색 4.수정 5.삭제 6.종료");
				out.print("선택>> ");
				no = scan.nextInt();
				if (no > 6 || no < 1) {
					System.out.println("1~6 사이의 숫자를 입력하여 주십시오.");
					continue;
				}
			} catch (Exception e) {
				out.println("1.입력 2.출력 3.검색 4.수정 5.삭제 6.종료");
				out.print("선택>> ");
				no = scan.nextInt();
			}
			break;
		}
		return no;
	}
	
	public static void run() {
		switch(menu()) {
		case 1 : input(); break;
		case 2 : output(); break;
		case 3 : search(); break;
		case 4 : modify(); break;
		case 5 : delete(); break;
		case 6 : end(); break;
		default : out.println("--- 해당 사항 없습니다! ---");
		}
		System.out.println("------------------------------------");
	}
	
	private static void end() {
		System.out.println("::::: END :::::");
		System.out.println("프로그램 종료!");
		System.out.println("수고하셨습니다!");
		System.exit(0);
	}

	private static void delete() {
		System.out.println("::::: DELETE :::::");
		// 이름으로 검색 후 삭제
		System.out.print("삭제할 이름을 입력하세요 : ");
		String deleteName = scan.next();
		
		for(int i=0; i < top; i++)
		{
			if(deleteName.equals(sArr[i]))
			{
				
				System.out.println("삭제되었습니다.");
			}
		}
				
		
	}

	private static void modify() {
		System.out.println("::::: MODIFY :::::");
		// 이름으로 검색 후 수정 
		// 이름,국어, 영어, 수학점수 수정!
		System.out.print("수정할 이름을 입력하세요 : ");
		String modifyName = scan.next();
		int index = Index(modifyName);
		
		int ea = 0;
		
		for (int i = 0; i < top; i++) {
			if (modifyName.equals(sArr[i].name)) {
				System.out.println("찾았습니다");
				System.out.println(sArr[i]);
				ea++;
			}
		}
		if(ea == 0) {
			System.out.println("없습니다");
		}
		
		
		System.out.println("수정할 부분을 입력해주세요");
		System.out.print("1. 이름  2. 국어  3. 영어  4. 수학 : ");
		int modifyNum = scan.nextInt();
		
		
		switch(modifyNum) {
		case 1:
			System.out.println("수정할 이름을 입력하세요");
			String modifyN = scan.next();
			sArr[index].name = modifyN;
			System.out.println("수정되었습니다.");
			break;
			
		case 2:
			System.out.println("수정할 국어점수를 입력하세요");
			int modifyk = scan.nextInt();
			sArr[index].kor = modifyk;
			System.out.println("수정되었습니다.");
			sArr[index].math();
			
			break;
		case 3:
			System.out.println("수정할 영어점수를 입력하세요");
			int modifye = scan.nextInt();
			sArr[index].eng = modifye;
			System.out.println("수정되었습니다.");
			sArr[index].math();
			break;
		case 4:
			System.out.println("수정할 수학점수를 입력하세요");
			int modifym = scan.nextInt();
			sArr[index].mat = modifym;
			System.out.println("수정되었습니다.");
			sArr[index].math();
			break;
			
			
		}
		
			
		
		
	}

	private static void search() {
		System.out.println("::::: SEARCH :::::");
		// 이름으로 검색
		System.out.print("검색할 이름을 입력하세요 : ");
		String searchName = scan.next();
		
		
		int ea = 0;

		for (int i = 0; i < top; i++) {
			if (searchName.equals(sArr[i].name)) {
				System.out.println(sArr[i]);
				ea++;
			}
		}
		if (ea == 0) {
			System.out.println("없습니다");
		} 
		
	}

	private static void output() {
		System.out.println(":::::::::::::::::::::::::::: OUTPUT ::::::::::::::::::::::::::::");
		// 배열의 목록 출력
		// 번호, 성명, 국어, 영어, 수학, 총점, 평균, 학점, 등수, 등수를 기준으로 정렬
		for(Student std : sArr) {
			if(std == null) break;
			Rank();
			System.out.println(std);
		}
	}

	private static void input() {
		System.out.println("::::: INPUT :::::");
		// 성명, 국어, 영어, 수학를 배열에 입력 받는다.
		// 입력 받은 국영수 점수의 총점과 평균, 평균의 학점, 
		// 입력 된 학생의 등수가 셋팅 된다.

		System.out.print("이름을 입력하세요:");
		String name = scan.next();
		
		
		System.out.print("국어점수를 입력하세요:");
		int kor = scan.nextInt();
		System.out.print("영어 점수를 입력하세요:");
		int eng = scan.nextInt();
		System.out.print("수학 점수를 입력하세요:");
		int mat = scan.nextInt();

		sArr[top++] = new Student(sequence++,name, kor,eng,mat);
		
	}
		
	

	public static void main(String[] args) {
		out.println("::::: 성적 출력 프로그램 :::::");
		while(true) {
			run();
		}
	}
}