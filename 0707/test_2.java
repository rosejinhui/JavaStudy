package class_test;

import java.util.Scanner;

public class test_2 {
	public static void main(String[] args) {
		
//		2. 이름, 나이, 체중을 입력받아 출력하는 예제를 작성하시오.
//		실행결과:
//		이름, 나이, 체중을 입력해주세요. >> 
//		은진
//		25
//		60 (입력하기)
//		이름은 은진, 25살, 60kg입니다.
		//-----------------------------------------------------
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름, 나이, 체중을 입력해주세요 >> ");
		
		String name = sc.nextLine();
		int age = sc.nextInt();
		int weight = sc.nextInt();


		System.out.println("이름은 " + name + ", " + age + "살" + ", " + weight + "kg입니다.");
		System.out.println("이름은 " + name + ", " + age + "살" + ", " + weight + "kg입니다.");
				
	}

}
