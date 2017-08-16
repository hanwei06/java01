package test03;

import java.util.Scanner;

public class Test02 {
	
	public static void main(String[] args) {
		  
		Scanner sc  = new Scanner(System.in);
		double x = sc.nextDouble();
		int i=1;
		while (i<=5) {
			x = 0.3%x + x;
			i++;
		}
		System.out.println(x);
	}

}
