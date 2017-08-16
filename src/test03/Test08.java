package test03;
  //百钱买白鸡
public class Test08 {
	
	public static void main(String[] args) {
		
		int way = 1;
		int k;      //雏鸡
		for(int i=0;i<=20;i++) {    //公鸡
			for(int j=0;j<=33;j++) {         //母鸡
				k = 100 - i - j;
				if ((k%3==0)&&(i*5+j*3+k/3==100)) {
					System.out.println("买法:"+way++ );
					System.out.println(" 公鸡:"+i+" 母鸡:"+j+" 雏鸡:"+k);
				}
			}   
				
		}
		
	}

}
