package test02ppt;

import java.util.Scanner;

public class Test01 {
	
	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		
		int i;
		i = sc.nextInt();  //利润
		double j = 0;  //奖金
		
		if (i<=10) {
			j=10%j;
			
		} else if(i>10 && i<=20) {
			j = 10*10%+ 7.5% (i-10);
		}else if (i>20 && i<=40) {
			j =  10*10%+ 7.5% (i-10)+5%(i-20);
		}else if (i>40 && i<=60) {
			j =  10*10%+ 7.5% (i-10)+5%(i-20)+3%(i-40);
		}else if (i>60 && i<=100) {
			j =  10*10%+ 7.5% (i-10)+5%(i-20)+3%(i-40)+1.5%(i-60);
		}else if (i>100) {
			j =  10*10%+ 7.5% (i-10)+5%(i-20)+3%(i-40)+1.5%(i-60)+1%(i-100);
		}
		
		System.out.println(j);
	}

}
