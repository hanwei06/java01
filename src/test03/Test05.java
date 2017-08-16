package test03;
      //½×³Ë
import java.util.Scanner;

public class Test05 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		long sum =1;
		for(int i=1;i<=n;i++) {
			sum*=i;
		}
		System.out.println(sum);
		
	}

}
