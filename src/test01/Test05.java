package test01;
//空心矩形
public class Test05 {
	
	public static void main(String[] args) {
		
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
