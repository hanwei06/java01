package objectop02;

public class Player {
	
	static private int sum ;
	static void playerCreate() {
		while (sum<=11) {
			sum ++;
			System.out.println("������һ������");
			
		} 
			System.out.println("�Բ����Ѿ�������11�����󡣲����ٴ���������");

		}

	public static int getSum() {
		return sum;
	}
	public static void setSum(int sum) {
		Player.sum = sum;
	}

}
