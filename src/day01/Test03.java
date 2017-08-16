package day01;

//9*9乘法表

public class Test03 {
	
	public static void main(String[] args) {
		
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=i;j++) {
				
				System.out.print(i+"*"+j+"="+i*j+"\t\t");   //不能用println
			}
		
			System.out.println("");
		}
		
		
	}

}
