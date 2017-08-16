package test02ppt;
      //判断偶数和奇数
import java.util.Scanner;

public class Test04 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int i = scanner.nextInt();
		if (i%2==0) {
			System.out.println("偶数");
		}
		else {
			System.out.println("奇数");
		}
	}

}
