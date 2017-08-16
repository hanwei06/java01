package test02ppt;

import java.util.Scanner;

public class Test02 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double score = sc.nextDouble();
		if (score>=0 && score<=100) {
			
		
		int  grade=(int)score/10;
		switch (grade) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("E\n");
			break;
		case 6:
			System.out.println("D\n");
			break;
		case 7:		
			System.out.println("C\n");
			break;
		case 8:
			System.out.println("B\n");
			break;
		case 9:
			System.out.println("A\n");
			break;
		default:
			grade=10;
			System.out.println("A\n");
			break;
		}
		}else {
			System.out.println("输入无效");
		}
	}

}
