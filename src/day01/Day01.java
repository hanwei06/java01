package day01;

import java.util.Scanner;

public class Day01 {
	
	public static void main(String[] args) {
		
		int a=1;
		int b=2;
		int sum=0;
		sum=a+b;
	    System.out.println(sum);
	    
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    switch (n) {
		case 1:
			System.out.println("yes");
			break;
		case 2:
			System.out.println("yes");
			break;
		case 3:
			System.out.println("yes");
			break;

		default:
			System.out.println("no");
			break;
		}
	}

}
