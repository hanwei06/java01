package test01;
//平行四边形
public class Test07 {
	
	public static void main(String[] args) {
		
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=5-i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<=5;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
