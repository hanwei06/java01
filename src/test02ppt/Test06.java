package test02ppt;

import java.util.Scanner;

public class Test06 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		if (i%5==0 && i%6==0) {
			System.out.println("能被5和6同时整除");
		} else if(i%5==0 && i%6!=0){
			System.out.println("只能被5整除");
		} else if (i%5!=0 && i%6==0) {
			System.out.println("只能被6整除");
		} else if (i%5!=0 || i%6!=0) {
			System.out.println("不能被5或6整除");
		}
		
	}

}
