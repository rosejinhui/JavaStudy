package class_test;

import java.util.Scanner;

public class test_2 {
	public static void main(String[] args) {
		
//		2. �̸�, ����, ü���� �Է¹޾� ����ϴ� ������ �ۼ��Ͻÿ�.
//		������:
//		�̸�, ����, ü���� �Է����ּ���. >> 
//		����
//		25
//		60 (�Է��ϱ�)
//		�̸��� ����, 25��, 60kg�Դϴ�.
		//-----------------------------------------------------
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�̸�, ����, ü���� �Է����ּ��� >> ");
		
		String name = sc.nextLine();
		int age = sc.nextInt();
		int weight = sc.nextInt();


		System.out.println("�̸��� " + name + ", " + age + "��" + ", " + weight + "kg�Դϴ�.");
		System.out.println("�̸��� " + name + ", " + age + "��" + ", " + weight + "kg�Դϴ�.");
				
	}

}
