package day01;

public class Day03 {
	
	public void age() {
		int age=0;
		age=age+7;
		System.out.println("age:"+age);
	}
	
	private  static double salary;
	public static final String DEPARTMENT="kaifa";
	
	public static void main(String[] args) {
		
		System.out.println("hello neusoft");
		
		Day03 test = new Day03();
		test.age();
		
		salary=1000;
		System.out.println(DEPARTMENT +"xinshui:"+salary);
	}

}
