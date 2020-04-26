package github_test.code;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//			한글 주석
		
		Scanner scan = new Scanner(System.in);
		System.out.print("생년원일 입력:");
		int myBirthYear = scan.nextInt();
		
		int koreanAge = 2020 - myBirthYear +1;
		
		System.out.println(koreanAge);
		
		
	}

}
