package objectop02;

public class Player {
	
	static private int sum ;
	static void playerCreate() {
		while (sum<=11) {
			sum ++;
			System.out.println("创建了一个对象");
			
		} 
			System.out.println("对不起，已经创建了11个对象。不能再创建对象了");

		}

	public static int getSum() {
		return sum;
	}
	public static void setSum(int sum) {
		Player.sum = sum;
	}

}
