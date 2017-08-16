package test01;
            
public class Test08 {
	
     public static void main(String[] args) {
    	 
    	 for(int i=0;i<=5;i++) {
 			
 			for(int j=0;j<=5+i;j++) {
 				System.out.print(" *");
 			}
 			System.out.println();
 		}
    	 
    	 
    	 for(int i=0;i<=17;i++) {
 			System.out.print(" *");
 			for(int j=0;j<=17;j++) {
 				if (i==0 || i==17 || j ==17 ) {
 					System.out.print("*");
 				} else {
 					System.out.print(" ");

 				}
 			}
 			System.out.println();
 		}
    }
	
}


