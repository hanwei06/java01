package test02ppt;
       //输出一个几位数，并且输出每一位的数字
import java.util.Scanner;

public class Test07 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		if (i/10000!=0) {
			System.out.println("这是五位数");
//			System.out.println("这位数是"+i/10000);
		}else if(i/1000!=0) {
			System.out.println("这是四位数");
//			System.out.println("这位数是"+i/1000);
		}else if(i/100!=0) {
			System.out.println("这是三位数");
//			System.out.println("这位数是"+i/100);
		}else if(i/10!=0) {
			System.out.println("这是二位数");
//			System.out.println("这位数是"+i/10);
		}else if(i/1!=0) {
			System.out.println("这是一位数");
//			System.out.println("这位数是"+i/1);
		}
		System.out.println("万位："+i/10000+"千位"+(i/1000)%10+"百位"+(i/100)%10+"十位"+(i/10)%10+"个位"+i%10);
		
	}

}
