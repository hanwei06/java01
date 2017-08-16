package test03;

public class Test11 {
	
	public static void main(String[] args) {
		print(11); 
    }

		public static void print(int size) {
	        if (size % 2 == 0) {
	            size++; // 计算菱形大小
	        }
	        int i;
	        int j;
	        //前面带空格的行
	        for (i = 0; i < size / 2 ; i++) {

	            for (j = 0; j < size / 2 - i; j++) {
	                System.out.print(" ");
	            }
	            System.out.print("*");
	            for (j = 0; j < 2 * i - 1; j++) {
	                System.out.print(" ");              
	            }
	            if (i==0) {}
	            else{
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	        //输出最后一行
	        for(i=0;i<size;i++){
	            System.out.print("*");
	        }
	        
	}
		

}
