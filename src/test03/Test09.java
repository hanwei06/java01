package test03;
  //百马百担
public class Test09 {
	
	public static void main(String[] args) {
		
		int way =1;
		int k;                 //小马
		for(int i=0;i<=33;i++) {   //大马
			for(int j=0;j<=50;j++) {    //中马
				k=100-i-j;
				if ((k%2==0)&&(3*i+2*j+k/2==100)) {
					System.out.println("方法："+way++);
					System.out.println("大马："+i+" 中马:"+j+" 小马:"+k);
				}
			}
		}
		
	}

}
