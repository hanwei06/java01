package test03;
                   //��дһ���������������200����С������
public class Test13 {
	
	public static void main(String[] args) {
		
		for(int i=200;i<250;i++) {
			boolean b = true;
			for(int j=2;j<i;j++) {
				
			if (i%j==0) {
				b=false;
				break;
			}
		}
			if (!b) {
				continue;
			}
			System.out.println(i);
			break;
		}
	}

}
