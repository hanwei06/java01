package day01;

   //正方形画图
public class Test04 {
	
	public static void main(String[] args) {
		
		for(int i=1;i<=20;i++) {
			
			System.out.print("x");
			for(int j=1;j<=20;j++) {
				if (i==1 || i==20 || j==20) 
					System.out.print("x");
				else {
					System.out.print("o");

				}
			}
			System.out.println();
		}
		
	}
}	