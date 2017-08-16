package test03;
     //ling xing buhui
public class Test04 {
	
	public static void main(String[] args) {
		
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=5-i;j++) {
				
				System.out.print(" ");
			}
			for(int k=0;k<=2*i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int a=4;a>=0;a--) {
			for(int b=4;b<a;b-- ) {
				System.out.print(" ");
			}
			for(int c=0;c<=2*a-1;c++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
