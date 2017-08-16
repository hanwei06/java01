package test02ppt;

import java.util.Scanner;

public class Test05 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if (x==1) {
			System.out.println("x=1");
		} else if(x==5){
			System.out.println("x=5");
		}else if (x==10) {
			System.out.println("x=10");
		}else {
			System.out.println("x=none");
		}
		
	}

}
