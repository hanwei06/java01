package test03;

public class Test01 {
	
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
		
		
		for(int i=0;i<=10;i++) {
			System.out.print("*");
			for(int j=0;j<=10;j++) {
				if (i==0 || i==10 || j ==10 ) {
					System.out.print("*");
				} else {
					System.out.print(" ");

				}
			}
			System.out.println();
		}

}
}
