package test03;
              //�ж�����
import java.util.Scanner;

public class Test12 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n%4==0 &&n%100!=0 ||n%400==0) {
			System.out.println(n+"��������");
		}else {
			System.out.println(n+"����ƽ��");
		}
	}

}
